package io.epal.transport.service;


import io.epal.transport.domain.Bus;

import java.util.List;
import java.util.Optional;

public interface BusService {
    List<Bus> findAll();

    void save(Bus newBus);

    Optional<Bus> findInDuty(Long id);

    List<Bus> findAllBusesByBusLineId(Long busLineId);

    Bus findBusDetailsById(Long busId);

}
