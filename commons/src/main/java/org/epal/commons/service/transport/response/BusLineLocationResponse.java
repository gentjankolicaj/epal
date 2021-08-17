package org.epal.commons.service.transport.response;

import lombok.Data;
import org.epal.commons.http.AbstractResponse;
import org.epal.commons.service.transport.model.location.BusLineLocation;

import java.util.List;

@Data
public class BusLineLocationResponse extends AbstractResponse<Object, List<BusLineLocation>> {
    public BusLineLocationResponse(Object meta, List<BusLineLocation> data) {
        super(meta, data);
    }

    public BusLineLocationResponse() {
    }
}
