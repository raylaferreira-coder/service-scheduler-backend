package com.servicescheduler.backend.dto.response;

import java.time.LocalDate;

public record CustomerResponseDTO(
        Long id,
        String name,
        String email,
        String phone,
        LocalDate birthDate
) {
}
