package com.servicescheduler.backend.repository;

import com.servicescheduler.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Customer,Long> {

}
