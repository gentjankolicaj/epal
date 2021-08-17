package org.epal.client_service.repository;

import org.epal.commons.service.client.model.FavBusLine;
import org.epal.commons.service.client.model.id.FavBusLineId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavBusLineRepository extends JpaRepository<FavBusLine, FavBusLineId> {
    List<FavBusLine> findByUserId(Long userId);
    List<FavBusLine> findByBusLineId(Long busLineId);
}
