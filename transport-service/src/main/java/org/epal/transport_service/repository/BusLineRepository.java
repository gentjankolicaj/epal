package org.epal.transport_service.repository;


import org.epal.transport_service.domain.BusLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusLineRepository extends JpaRepository<BusLine, Long> {
}
