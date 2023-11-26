package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.model.RequestResponseLog;

@Repository
public interface CalculationLogRepository extends JpaRepository<RequestResponseLog, Long> {

}
