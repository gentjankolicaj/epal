package org.epal.transport_service.controller;

import org.epal.commons.service.transport.response.BusLineLocationResponse;
import org.epal.commons.service.transport.response.BusLocationHistoryResponse;
import org.epal.commons.service.transport.response.BusLocationResponse;
import org.epal.transport_service.service.BusLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BusLocationController.API_ENDPOINT)
public class BusLocationController {
    protected final static String API_ENDPOINT="/api/bus_location";

    private final BusLocationService busLocationService;

    @Autowired
    public BusLocationController(BusLocationService busLocationService) {
        this.busLocationService = busLocationService;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public BusLineLocationResponse getBusLineLocationsByBusLineId(@RequestParam("busLineId") Long busLineId){
        return busLocationService.getBusLineLocationsByBusLineId(busLineId);
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public BusLocationResponse getBusLocationByBusId(@RequestParam("busId") Long busId){
        return busLocationService.getBusLocationByBusId(busId);
    }

    @GetMapping("/history")
    @ResponseStatus(HttpStatus.OK)
    public BusLocationHistoryResponse getBusLocationHistoryByBusId(@RequestParam("busId") Long busId, @RequestParam("minInterval") Long minInterval){
        return busLocationService.getBusLocationHistoryByBusId(busId,minInterval);
    }

}
