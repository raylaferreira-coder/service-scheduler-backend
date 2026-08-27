package com.servicescheduler.backend.repository;

import com.servicescheduler.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulingRepository extends JpaRepository<Customer,Long> {

}
