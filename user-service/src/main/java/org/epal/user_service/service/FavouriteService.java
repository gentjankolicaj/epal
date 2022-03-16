package org.epal.user_service.service;

import org.epal.user_service.domain.FavBusLine;

import java.util.List;

public interface FavouriteService {

    void save(Long userId, Long busLineId);

    void delete(Long userId, Long busLineId);

    List<FavBusLine> findBusLineByUserId(Long userId);
}
