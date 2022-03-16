package org.epal.transport_service.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractResponse<M,D> {
    private M meta;
    private D data;

}
