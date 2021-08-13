package org.epal.client_service.service;

import org.epal.commons.client.model.FavBusLine;

import java.util.List;

public interface FavouriteService {

    void save(Long userId, Long busLineId);
    void delete(Long userId, Long busLineId);
    List<FavBusLine> findBusLineByUserId(Long userId);
}
