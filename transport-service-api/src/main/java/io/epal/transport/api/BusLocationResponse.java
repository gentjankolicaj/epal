package io.epal.transport.api;

import lombok.Data;


@Data
public class BusLocationResponse extends AbstractResponse<Object, Object> {

    public BusLocationResponse(Object meta, Object data) {
        super(meta, data);
    }
}
