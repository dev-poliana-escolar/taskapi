package com.projeto.task.dto;

public record TaskResponseDTO(Long id,
                              String titulo,
                              boolean concluida,
                              String prioridade) {
}
