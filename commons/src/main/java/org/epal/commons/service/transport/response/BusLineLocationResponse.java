package org.epal.commons.service.transport.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.epal.commons.http.AbstractResponse;
import org.epal.commons.service.transport.model.location.BusLineLocation;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BusLineLocationResponse extends AbstractResponse<Object, List<BusLineLocation>> {
}
