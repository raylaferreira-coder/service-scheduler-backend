package com.servicescheduler.backend.model;

import com.servicescheduler.backend.model.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="scheduling")
@Getter
@Setter
@AllArgsConstructor
public class Scheduling {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="localDateTime",nullable = false)
    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    @Column(name="Status",nullable = false)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    private Service service;

    @Column(name="priceAtBooking", nullable = false)
    private BigDecimal priceAtBooking;
}
