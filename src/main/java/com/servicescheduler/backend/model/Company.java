package com.servicescheduler.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name="Company")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company extends User{

    @Column(name = "cnpj", unique = true, nullable = false, length = 14)
    private String cnpj;

    @Column(name = "creation_date", nullable = false)
    private LocalDate creationDate;

    @Column(name = "deactivation_date")
    private LocalDate deactivationDate;

    @Column(name = "active", nullable = false)
    private Boolean active = true;
}
