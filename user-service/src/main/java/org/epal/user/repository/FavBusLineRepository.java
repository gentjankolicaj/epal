package org.epal.user.repository;

import org.epal.user.domain.FavBusLine;
import org.epal.user.domain.FavBusLineId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavBusLineRepository extends JpaRepository<FavBusLine, FavBusLineId> {
    List<FavBusLine> findByUserId(Long userId);

    List<FavBusLine> findByBusLineId(Long busLineId);
}
