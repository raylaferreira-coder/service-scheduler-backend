package com.servicescheduler.backend.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
public abstract class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", nullable = false, length = 100)
  private String name;

  @Column(name="telephone", length = 15)
  private String telephone;

  @Column(name = "email", unique = true, nullable = false, length = 100)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "creation_date", nullable = false)
  private LocalDate creationDate;

  @Column(name = "deactivation_date")
  private LocalDate deactivationDate;

  @Column(name = "active", nullable = false)
  private Boolean active = true;
}
