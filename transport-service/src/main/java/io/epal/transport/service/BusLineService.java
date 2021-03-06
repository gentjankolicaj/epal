package io.epal.transport.service;


import io.epal.transport.domain.BusLine;

import java.util.List;
import java.util.Optional;

public interface BusLineService {
    List<BusLine> findAll();

    Optional<BusLine> findById(Long id);

}
