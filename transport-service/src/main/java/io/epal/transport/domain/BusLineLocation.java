package io.epal.transport.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusLineLocation {
    private BusLine busLine;
    private List<Coordinate> coordinates;
}
