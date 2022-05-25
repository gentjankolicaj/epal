package io.epal.transport.service;

import io.epal.transport.data_provider.LocationProvider;
import io.epal.transport.domain.BusLineLocation;
import io.epal.transport.domain.BusLocation;
import org.epal.transport_service.api.bus.BusLineLocationResponse;
import org.epal.transport_service.api.bus.BusLocationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationProvider locationProvider;

    @Override
    public BusLineLocationResponse getBusLineLocationByBusLineId(Long busLineId) {
        Object responseMeta = null; // for metadata ,currently not implemented
        BusLineLocation busLineLocation = locationProvider.getBusLineLocation(busLineId);
        return new BusLineLocationResponse(responseMeta, busLineLocation);
    }

    @Override
    public BusLocationResponse getBusLocationByBusId(Long busId) {
        BusLocation busLocation = locationProvider.getBusLocation(busId);
        return new BusLocationResponse(null, busLocation);
    }


}
