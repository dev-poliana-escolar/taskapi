package com.projeto.task.dto;

import java.time.LocalDate;

public record TaskResquestDTO(String titulo,
                              String descricao,
                              boolean concluida,
                              String prioridade) {
}
