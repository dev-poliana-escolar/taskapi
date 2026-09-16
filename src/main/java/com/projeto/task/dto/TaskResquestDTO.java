package com.projeto.task.dto;

import java.time.LocalDate;

public record TaskResquestDTO(Long id,
                              String titulo,
                              String descricao,
                              LocalDate prazo) {
}
