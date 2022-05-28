package io.epal.transport.service;


import io.epal.transport.api.BusLineLocationResponse;
import io.epal.transport.api.BusLocationResponse;

public interface LocationService {

    BusLineLocationResponse getBusLineLocationByBusLineId(Long busLineId);

    BusLocationResponse getBusLocationByBusId(Long busId);

}
