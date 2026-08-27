package com.servicescheduler.backend.repository;

import com.servicescheduler.backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeerRepository extends JpaRepository<Employee,Long> {

}
