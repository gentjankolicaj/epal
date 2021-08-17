package org.epal.client_service.client;

import org.epal.commons.service.transport.model.Bus;
import org.epal.commons.service.transport.model.BusLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

/**
 * -Same name as spring.application.name=transport-service
 * -Spring automatically creates impl of TransportServiceClient
 * -Spring automatically implements it
 */
@FeignClient(name="transport-service")
public interface TransportServiceClient {

    //======================== Bus ====================================
    //Same with methods on transport-service controllers,to interact with them
    @GetMapping("/api/bus")
    @ResponseStatus(HttpStatus.OK)
    List<Bus> findAllBuses();

    @GetMapping("/api/bus/{busId}")
    @ResponseStatus(HttpStatus.OK)
    Optional<Bus> findBusById(@PathVariable Long busId);

    @GetMapping("/api/bus/duty/{busId}")
    @ResponseStatus(HttpStatus.OK)
    Boolean isInDuty(@PathVariable Long busId);



    //=========================== Bus lines =======================================
    @GetMapping("/api/bus_line")
    @ResponseStatus(HttpStatus.OK)
    List<BusLine> findAllBusLines();

    @GetMapping("/api/bus_line/{busLineId}")
    @ResponseStatus(HttpStatus.OK)
    Optional<BusLine> findBusLineById(@PathVariable Long busLineId);


}
