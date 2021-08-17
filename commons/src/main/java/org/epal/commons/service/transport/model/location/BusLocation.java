package org.epal.commons.service.transport.model.location;

import org.epal.commons.service.transport.model.Coordinate;
import org.epal.commons.service.transport.model.MotionMeta;

public class BusLocation extends AbstractLocation {
    public BusLocation(Coordinate coordinate, MotionMeta motionMeta) {
        super(coordinate, motionMeta);
    }

    public BusLocation() {
    }
}
