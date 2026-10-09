package com.projeto.task.dto;

import com.projeto.task.model.Task;
import java.util.Set;

public record UserRequestDTO(String nome,
                             String email,
                             String cargo,
                             Set<Task> tarefas ) {
}
