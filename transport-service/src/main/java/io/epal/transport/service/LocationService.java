package io.epal.transport.service;


import org.epal.transport_service.api.bus.BusLineLocationResponse;
import org.epal.transport_service.api.bus.BusLocationResponse;

public interface LocationService {

    BusLineLocationResponse getBusLineLocationByBusLineId(Long busLineId);

    BusLocationResponse getBusLocationByBusId(Long busId);

}
