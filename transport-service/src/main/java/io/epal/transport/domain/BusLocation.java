package io.epal.transport.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusLocation {
    private Bus bus;
    private Coordinate coordinate;
}
