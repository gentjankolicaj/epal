package org.epal.transport_service.api.bus;

import lombok.Data;
import org.epal.transport_service.api.AbstractResponse;
import org.epal.transport_service.domain.BusLocation;

@Data
public class BusLocationResponse extends AbstractResponse<Object, BusLocation> {

    public BusLocationResponse(Object meta, BusLocation data) {
        super(meta, data);
    }
}
