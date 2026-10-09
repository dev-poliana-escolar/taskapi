package com.projeto.task.dto;

import com.projeto.task.model.User;

public record TaskResquestDTO(String titulo,
                              String descricao,
                              boolean concluida,
                              String prioridade,
                              User usuario) {
}
