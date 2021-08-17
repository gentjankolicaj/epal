package org.epal.transport_service.data_provider;

import org.epal.commons.service.transport.model.Bus;
import org.epal.commons.service.transport.model.Coordinate;
import org.epal.commons.service.transport.model.location.BusLineLocation;
import org.epal.commons.service.transport.model.location.BusLocation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy class for providing test locations
 */
@Repository
public class LocationProvider {

    public List<BusLineLocation> getBusLineLocation(Long busLineId){
        int maxBuses=10;
        List<BusLineLocation> busLineLocations=new ArrayList<>();
        for(int i=0;i<maxBuses;i++){
            Bus bus=new Bus(new Long(i),"AA"+i,"BENZ-"+i);
            Coordinate coordinate=new Coordinate(new Long(30+i),new Long(10+i));
            busLineLocations.add(new BusLineLocation(bus,coordinate,null));
        }
        return busLineLocations;
    }

    public BusLocation getBusLocation(Long busId){
        int random=(int)(Math.random()*10);
        BusLocation busLocation=new BusLocation(new Coordinate(new Long(30+random),new Long(10+random)),null);
        return busLocation;
    }

    public List<BusLocation> getBusLocationHistory(Long busId,Long minInterval){
        int random=(int)(Math.random()*10);
        List<BusLocation> busLocations=new ArrayList<>();
        for(int i=0;i<minInterval;i++)
           busLocations.add(new BusLocation(new Coordinate(new Long(30+random),new Long(10+random)),null));

         return busLocations;
    }


}
