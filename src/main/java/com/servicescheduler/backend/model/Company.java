package com.servicescheduler.backend.model;

import com.servicescheduler.backend.model.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Company")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company extends User{

    @Column(name = "cnpj", unique = true, nullable = false, length = 14)
    private String cnpj;

    @Column(name = "companyName", nullable = false, length = 100)
    private String companyName;

    @Enumerated(EnumType.STRING)
    @Column(name="category",nullable=false)
    private Category category;

    @Column(name="online")
    private Boolean online;


}
