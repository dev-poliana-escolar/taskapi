package com.projeto.task.dto;

import com.projeto.task.model.Prioridade;

public record TaskResponseDTO(Long id,
                              String titulo,
                              String descricao,
                              boolean concluida,
                              Prioridade prioridade) {
}
