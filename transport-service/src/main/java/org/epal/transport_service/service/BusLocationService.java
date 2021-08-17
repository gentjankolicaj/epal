package org.epal.transport_service.service;

import org.epal.commons.service.transport.response.BusLineLocationResponse;
import org.epal.commons.service.transport.response.BusLocationHistoryResponse;
import org.epal.commons.service.transport.response.BusLocationResponse;

public interface BusLocationService {

    BusLineLocationResponse getBusLineLocationsByBusLineId(Long busLineId);
    BusLocationResponse getBusLocationByBusId(Long busId);
    BusLocationHistoryResponse getBusLocationHistoryByBusId(Long busId, Long minInterval);

}
