package org.epal.commons.service.transport.response;

import lombok.Data;
import org.epal.commons.http.AbstractResponse;
import org.epal.commons.service.transport.model.location.BusLocation;

@Data
public class BusLocationResponse extends AbstractResponse<Object, BusLocation> {
    public BusLocationResponse(Object meta, BusLocation data) {
        super(meta, data);
    }

    public BusLocationResponse() {
    }
}
