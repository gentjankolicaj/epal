package org.epal.commons.service.transport.response;

import lombok.Data;
import org.epal.commons.http.AbstractResponse;
import org.epal.commons.service.transport.model.location.BusLocation;

import java.util.List;

@Data
public class BusLocationHistoryResponse extends AbstractResponse<Object, List<BusLocation>> {
    public BusLocationHistoryResponse(Object meta, List<BusLocation> data) {
        super(meta, data);
    }

    public BusLocationHistoryResponse() {
    }
}
