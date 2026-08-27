package com.servicescheduler.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="service")
@Getter
@Setter
@AllArgsConstructor
public class Service {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name",nullable = false,length=50)
    private String name;

    @Column(name="description",nullable = false,length = 200)
    private String description;

    @Column(name="price",nullable = false,precision=20,scale=2)
    private BigDecimal price;

    @Column(name = "duration_minutes", nullable = false)
    private Integer durationMinutes;

    @Column(name="active",nullable = false)
    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @Column(name="dateCreation",nullable = false)
    private LocalDate dateCreation;
}
