package org.epal.transport_service.repository;

import org.epal.commons.service.transport.model.BusLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusLineRepository extends JpaRepository<BusLine, Long> {
}
