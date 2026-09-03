package com.servicescheduler.backend.dto.request;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record CustomerRequestDTO(
        @NotBlank(message="O nome é obrigatório")
        String name,

        @NotBlank(message="O e-mail é obrigatório")
        String email,

        @NotBlank(message="O telefone é obrigatório")
        String phone,

        @NotBlank(message="A data de nascimento é obrigatória")
        LocalDate birthDate
) {
}
