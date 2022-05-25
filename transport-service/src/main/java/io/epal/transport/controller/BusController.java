package io.epal.transport.controller;

import io.epal.transport.domain.Bus;
import io.epal.transport.service.BusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus")
@Slf4j
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Bus> findAll() {
        log.info("Finding all buses.");
        return busService.findAll();
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Bus> findBusesByBusLineId(@RequestParam("busLineId") Long busLineId) {
        log.info("Finding all buses by bus line id " + busLineId);
        return busService.findAllBusesByBusLineId(busLineId);
    }

    @GetMapping("/{busId}")
    @ResponseStatus(HttpStatus.OK)
    public Bus findBusDetailsById(@PathVariable Long busId) {
        log.info("Finding bus details by bus  id " + busId);
        return busService.findBusDetailsById(busId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBus(@RequestBody Bus newBus) {
        busService.save(newBus);
    }

    @GetMapping("/duty/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean isInDuty(@PathVariable Long id) {
        log.info("IsInDuty mapping found.");
        Bus bus = busService.findInDuty(id)
                .orElseThrow(() -> new RuntimeException("Bus with id " + id + " is not in duty"));
        return bus != null;
    }
}
