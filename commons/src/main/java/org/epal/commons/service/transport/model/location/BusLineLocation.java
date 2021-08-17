package org.epal.commons.service.transport.model.location;

import lombok.Data;
import org.epal.commons.service.transport.model.Bus;
import org.epal.commons.service.transport.model.Coordinate;
import org.epal.commons.service.transport.model.MotionMeta;

@Data
public class BusLineLocation extends AbstractLocation {
    private Bus bus;
    public BusLineLocation(Bus bus,Coordinate coordinate, MotionMeta motionMeta) {
        super(coordinate, motionMeta);
        this.bus = bus;
    }
}
