package com.servicescheduler.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employee")
@Getter
@Setter
@AllArgsConstructor
public class Employee extends User {

    @Column(name="name",nullable = false,length=100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;
}
