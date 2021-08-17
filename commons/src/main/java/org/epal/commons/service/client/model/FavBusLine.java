package org.epal.commons.service.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.epal.commons.service.client.model.id.FavBusLineId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor

@IdClass(FavBusLineId.class)
@Entity
@Table(name = "fav_bus_line")
public class FavBusLine implements Serializable {

    @Id
    private Long userId;
    @Id
    private Long busLineId;

    private Instant createdDate;
    private Instant deletedDate;


}
