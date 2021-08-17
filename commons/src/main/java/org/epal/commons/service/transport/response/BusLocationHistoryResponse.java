package org.epal.commons.service.transport.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.epal.commons.http.AbstractResponse;
import org.epal.commons.service.transport.model.location.BusLocation;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusLocationHistoryResponse extends AbstractResponse<Object, List<BusLocation>> {
}
