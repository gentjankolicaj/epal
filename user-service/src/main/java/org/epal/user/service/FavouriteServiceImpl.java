package org.epal.user.service;

import lombok.AllArgsConstructor;
import org.epal.user.domain.FavBusLine;
import org.epal.user.domain.FavBusLineId;
import org.epal.user.repository.FavBusLineRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@AllArgsConstructor
public class FavouriteServiceImpl implements FavouriteService {
    private FavBusLineRepository favBusLineRepository;


    @Override
    public void save(Long userId, Long busLineId) {
        FavBusLine favBusLine = new FavBusLine(userId, busLineId, Instant.now(), null);
        favBusLineRepository.save(favBusLine);
    }

    @Override
    public void delete(Long userId, Long busLineId) {
        favBusLineRepository.deleteById(new FavBusLineId(userId, busLineId));
    }

    @Override
    public List<FavBusLine> findBusLineByUserId(Long userId) {
        return favBusLineRepository.findByUserId(userId);
    }
}
