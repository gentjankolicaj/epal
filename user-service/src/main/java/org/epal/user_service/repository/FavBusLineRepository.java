package org.epal.user_service.repository;

import org.epal.user_service.domain.FavBusLine;
import org.epal.user_service.domain.FavBusLineId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavBusLineRepository extends JpaRepository<FavBusLine, FavBusLineId> {
    List<FavBusLine> findByUserId(Long userId);

    List<FavBusLine> findByBusLineId(Long busLineId);
}
