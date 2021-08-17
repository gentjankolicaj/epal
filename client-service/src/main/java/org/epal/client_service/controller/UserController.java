package org.epal.client_service.controller;

import lombok.extern.slf4j.Slf4j;
import org.epal.client_service.client.TransportServiceClient;
import org.epal.client_service.service.FavouriteService;
import org.epal.client_service.service.UserService;
import org.epal.commons.service.client.model.FavBusLine;
import org.epal.commons.service.client.model.User;
import org.epal.commons.service.transport.model.BusLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreaker;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    private final UserService userService;
    private final FavouriteService favouriteService;

    private final TransportServiceClient transportServiceClient;
    private final Resilience4JCircuitBreakerFactory circuitBreakerFactory;
    private final ExecutorService traceableExecutorService;

    @Autowired
    public UserController(UserService userService, FavouriteService favouriteService, TransportServiceClient transportServiceClient, Resilience4JCircuitBreakerFactory circuitBreakerFactory, ExecutorService traceableExecutorService) {
        this.userService = userService;
        this.favouriteService = favouriteService;
        this.transportServiceClient = transportServiceClient;
        this.circuitBreakerFactory = circuitBreakerFactory;
        this.traceableExecutorService = traceableExecutorService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> find(@PathVariable Long userId){
        return userService.find(userId);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User newUser) {
        return userService.save(newUser);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public User update(@RequestBody User updatedUser){
        return userService.update(updatedUser);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long userId){
        userService.delete(userId);
    }


    @PostMapping("/{userId}/fav_bus_line/{busLineId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveFavBusLine(@PathVariable Long userId,@PathVariable Long busLineId){
         favouriteService.save(userId,busLineId);
    }

    @GetMapping("/{userId}/fav_bus_line")
    @ResponseStatus(HttpStatus.OK)
    public List<FavBusLine> findBusLine(@PathVariable Long userId){
        return favouriteService.findBusLineByUserId(userId);
    }

    @GetMapping("/{userId}/bus_line/{busLineId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<BusLine> findBusLine(@PathVariable Long userId, @PathVariable Long busLineId){
        log.info("User "+userId+" finding busLine "+busLineId);
        return transportServiceClient.findBusLineById(busLineId);
    }

    @GetMapping("/{userId}/bus_line")
    @ResponseStatus(HttpStatus.OK)
    public List<BusLine> findAllBusLines(@PathVariable Long userId){
        log.info("User "+userId+" finding all bus lines");

        //Add to circuit breaker factory the traceable-executor-service to share request-id
        circuitBreakerFactory.configureExecutorService(traceableExecutorService);

        //Create new circuit breaker with circuit breaker factory
        Resilience4JCircuitBreaker circuitBreaker=circuitBreakerFactory.create("transport-circuit");

        Supplier<List<BusLine>> listSupplier=()->transportServiceClient.findAllBusLines();
        List<BusLine> busLines=circuitBreaker.run(listSupplier,throwable -> handleErrorCase());

        if(busLines!=null)
            log.info("User "+userId+" found "+busLines.size()+" bus lines");
        else
            log.info("User "+userId+" found null bus lines");
            return busLines;
    }

    private List<BusLine> handleErrorCase(){
        return null;
    }

}
