package org.epal.commons.http;

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
