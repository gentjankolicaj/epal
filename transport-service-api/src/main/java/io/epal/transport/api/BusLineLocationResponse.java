package io.epal.transport.api;

import lombok.Data;

@Data
public class BusLineLocationResponse extends AbstractResponse<Object, Object> {

    public BusLineLocationResponse(Object meta, Object data) {
        super(meta, data);
    }
}
