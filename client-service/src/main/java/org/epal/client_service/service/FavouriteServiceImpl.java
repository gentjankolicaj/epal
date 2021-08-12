package org.epal.client_service.service;

import org.epal.client_service.repository.FavBusLineRepository;
import org.epal.commons.client.model.FavBusLine;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class FavouriteServiceImpl implements FavouriteService{
    private FavBusLineRepository favBusLineRepository;


    @Override
    public void save(Long userId, Long busLineId) {
        FavBusLine favBusLine=new FavBusLine(userId,busLineId, Instant.now(),null);
        favBusLineRepository.save(favBusLine);
    }

    @Override
    public List<FavBusLine> findBusLineByUserId(Long userId) {
        return favBusLineRepository.findByUserId(userId);
    }
}
