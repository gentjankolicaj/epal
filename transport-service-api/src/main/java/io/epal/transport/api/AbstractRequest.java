package io.epal.transport.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbstractRequest<M,D> {
    private M meta;
    private D data;
}
