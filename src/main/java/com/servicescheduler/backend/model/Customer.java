package com.servicescheduler.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends User{

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "cpf", unique = true, nullable = false, length = 11)
    private String cpf;

    @Column(name="data_nascimento", nullable=false)
    private LocalDate dateNascimento;

    @Column(name="online")
    private Boolean online;

}
