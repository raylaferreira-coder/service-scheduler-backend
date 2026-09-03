package com.servicescheduler.backend.dto.response;

import java.math.BigDecimal;

public record ServiceResponseDTO(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer durationMinutes,
        Boolean active
) {
}
