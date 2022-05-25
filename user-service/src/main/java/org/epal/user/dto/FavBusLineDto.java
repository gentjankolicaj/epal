package org.epal.user.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FavBusLineDto {

    private Long clientId;
    private Long busLineId;

}
