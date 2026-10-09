package com.projeto.task.service;

import com.projeto.task.dto.TaskResponseDTO;
import com.projeto.task.dto.TaskResquestDTO;
import com.projeto.task.model.Prioridade;
import com.projeto.task.model.Task;
import com.projeto.task.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskResponseDTO criar(TaskResquestDTO dto) {
        Task tarefa = new Task(null,dto.titulo(), dto.descricao(),Prioridade.BAIXA, false, dto.usuario());
        Task salva = repository.save(tarefa);
        return toResponseDTO(salva);
    }

    private TaskResponseDTO toResponseDTO(Task tarefa) {
        return new TaskResponseDTO(
                tarefa.getId(),
                tarefa.getTitulo(),
                tarefa.getDescricao(),
                tarefa.isConcluida(),
                tarefa.getPrioridade()
        );
    }
}