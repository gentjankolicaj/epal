package org.epal.commons.service.client.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.epal.commons.http.AbstractResponse;
import org.epal.commons.service.client.model.FavBusLine;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavBusLineResponse extends AbstractResponse<Object, FavBusLine> {
}
