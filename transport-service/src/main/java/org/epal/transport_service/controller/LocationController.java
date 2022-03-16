package org.epal.transport_service.controller;


import org.epal.transport_service.api.bus.BusLineLocationResponse;
import org.epal.transport_service.api.bus.BusLocationResponse;
import org.epal.transport_service.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(LocationController.API_ENDPOINT)
public class LocationController {
    protected final static String API_ENDPOINT = "/api/location";

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/bus_line")
    @ResponseStatus(HttpStatus.OK)
    public BusLineLocationResponse getBusLineLocationsByBusLineId(@RequestParam("busLineId") Long busLineId) {
        return locationService.getBusLineLocationByBusLineId(busLineId);
    }

    @GetMapping("/bus")
    @ResponseStatus(HttpStatus.OK)
    public BusLocationResponse getBusLocationByBusId(@RequestParam("busId") Long busId) {
        return locationService.getBusLocationByBusId(busId);
    }


}
