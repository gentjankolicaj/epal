package org.epal.transport_service.api.bus;

import lombok.Data;
import org.epal.transport_service.api.AbstractResponse;
import org.epal.transport_service.domain.BusLineLocation;

@Data
public class BusLineLocationResponse extends AbstractResponse<Object, BusLineLocation> {

    public BusLineLocationResponse(Object meta, BusLineLocation data) {
        super(meta, data);
    }
}
