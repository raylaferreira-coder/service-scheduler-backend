package com.servicescheduler.backend.dto.request;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ServiceRequestDTO(

        @NotBlank(message = "O nome do serviço é obrigatório")
        @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
        String name,

        @NotBlank(message = "A descrição é obrigatória")
        @Size(max = 200, message = "A descrição deve ter no máximo 200 caracteres")
        String description,

        @NotNull(message = "O preço do serviço é obrigatório")
        @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que zero")
        BigDecimal price,

        @NotNull(message = "A duração média do serviço é obrigatória")
        @Min(value = 5, message = "A duração deve ser de pelo menos 5 minuto")
        Integer durationMinutes,

        @NotNull(message = "Informar se o serviço está ativo é obrigatório")
        Boolean active
) {
}
