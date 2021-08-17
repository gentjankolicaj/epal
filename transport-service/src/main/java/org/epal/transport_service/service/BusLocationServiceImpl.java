package org.epal.transport_service.service;

import org.epal.commons.service.transport.model.location.BusLineLocation;
import org.epal.commons.service.transport.model.location.BusLocation;
import org.epal.commons.service.transport.response.BusLineLocationResponse;
import org.epal.commons.service.transport.response.BusLocationHistoryResponse;
import org.epal.commons.service.transport.response.BusLocationResponse;
import org.epal.transport_service.data_provider.LocationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusLocationServiceImpl implements BusLocationService{

    @Autowired
    private LocationProvider locationProvider;

    @Override
    public BusLineLocationResponse getBusLineLocationsByBusLineId(Long busLineId) {
        Object responseMeta=null; // for metadata ,currently not implemented
        List<BusLineLocation> busLineLocations=locationProvider.getBusLineLocation(busLineId);
        return new BusLineLocationResponse(responseMeta,busLineLocations);
    }

    @Override
    public BusLocationResponse getBusLocationByBusId(Long busId) {
        BusLocation busLocation=locationProvider.getBusLocation(busId);
        return new BusLocationResponse(null,busLocation);
    }

    @Override
    public BusLocationHistoryResponse getBusLocationHistoryByBusId(Long busId, Long minInterval) {
        List<BusLocation> busLocation=locationProvider.getBusLocationHistory(busId,minInterval);
        return new BusLocationHistoryResponse(null,busLocation);
    }
}
