package org.epal.user_service.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavBusLineId implements Serializable {
    private Long userId;
    private Long busLineId;

}
