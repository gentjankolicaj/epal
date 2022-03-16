package org.epal.transport_service.data_provider;


import org.epal.transport_service.domain.BusLine;
import org.epal.transport_service.domain.BusLineLocation;
import org.epal.transport_service.domain.BusLocation;
import org.epal.transport_service.domain.Coordinate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy class for providing test locations
 */
@Repository
public class LocationProvider {

    public List<BusLineLocation> getBusLineLocations(int maxLines) {
        List<BusLineLocation> busLineLocations = new ArrayList<>();
        for (int i = 0; i < maxLines; i++) {
            List<Coordinate> coordinates = new ArrayList<>();
            for (int j = -1; j < i; j++)
                coordinates.add(new Coordinate(new Long(30 + i), new Long(10 + i)));
            busLineLocations.add(new BusLineLocation(new BusLine(Long.valueOf(i), "Tirane-Durres"), coordinates));
        }
        return busLineLocations;
    }

    public BusLineLocation getBusLineLocation(Long busLineId) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (int j = -1; j < busLineId; j++)
            coordinates.add(new Coordinate(new Long(30 + j), new Long(10 + j)));
        return new BusLineLocation(new BusLine(busLineId, "Tirane-Durres"), coordinates);

    }

    public BusLocation getBusLocation(Long busId) {
        int random = (int) (Math.random() * 10);
        BusLocation busLocation = new BusLocation(null, new Coordinate(new Long(30 + random), new Long(10 + random)));
        return busLocation;
    }

    public List<BusLocation> getBusLocationHistory(Long busId, Long minInterval) {
        int random = (int) (Math.random() * 10);
        List<BusLocation> busLocations = new ArrayList<>();
        for (int i = 0; i < minInterval; i++)
            busLocations.add(new BusLocation(null, new Coordinate(new Long(30 + random), new Long(10 + random))));

        return busLocations;
    }


}
