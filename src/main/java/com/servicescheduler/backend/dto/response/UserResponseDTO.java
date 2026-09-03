package com.servicescheduler.backend.dto.response;

public record UserResponseDTO(
        Long id,
        String name,
        String email
) {
}
