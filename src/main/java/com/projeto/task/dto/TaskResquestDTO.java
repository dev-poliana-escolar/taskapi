package com.projeto.task.dto;

import com.projeto.task.model.User;
import jakarta.validation.constraints.NotBlank;

public record TaskResquestDTO(@NotBlank
                              String titulo,
                              @NotBlank
                              String descricao,
                              boolean concluida,
                              String prioridade,
                              User usuario) {
}
