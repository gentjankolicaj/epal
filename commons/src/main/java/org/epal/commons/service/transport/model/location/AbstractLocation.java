package org.epal.commons.service.transport.model.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.epal.commons.service.transport.model.Coordinate;
import org.epal.commons.service.transport.model.MotionMeta;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractLocation implements Serializable {
    private Coordinate coordinate;
    private MotionMeta motionMeta;

}
