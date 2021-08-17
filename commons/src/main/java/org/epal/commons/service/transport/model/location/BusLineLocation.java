package org.epal.commons.service.transport.model.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.epal.commons.service.transport.model.Bus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusLineLocation extends AbstractLocation {
    private Bus bus;
}
