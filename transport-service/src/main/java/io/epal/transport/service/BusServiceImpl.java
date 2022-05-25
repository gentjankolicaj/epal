package io.epal.transport.service;


import io.epal.transport.domain.Bus;
import io.epal.transport.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BusServiceImpl implements BusService {
    private final BusRepository busRepository;

    @Autowired
    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public List<Bus> findAll() {
        return busRepository.findAll();
    }

    @Override
    public void save(Bus newBus) {
        busRepository.save(newBus);
    }

    @Override
    public Optional<Bus> findInDuty(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Bus> findAllBusesByBusLineId(Long busLineId) {
        return null;
    }

    @Override
    public Bus findBusDetailsById(Long busId) {
        return null;
    }
}
