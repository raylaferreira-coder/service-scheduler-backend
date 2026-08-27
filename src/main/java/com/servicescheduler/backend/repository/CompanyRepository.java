package com.servicescheduler.backend.repository;

import com.servicescheduler.backend.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {

}
