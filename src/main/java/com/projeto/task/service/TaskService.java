package com.projeto.task.service;

import com.projeto.task.dto.TaskResponseDTO;
import com.projeto.task.dto.TaskResquestDTO;
import com.projeto.task.model.Task;
import com.projeto.task.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final TaskRepository repository;
    private final AtomicLong sequencia = new AtomicLong();

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskResponseDTO criar(TaskResquestDTO dto) {
        Task tarefa = new Task(sequencia.incrementAndGet(), dto.titulo(), dto.descricao());
        Task salva = repository.salvar(tarefa);
        return toResponseDTO(salva);
    }

    private TaskResponseDTO toResponseDTO(Task tarefa) {
        return new TaskResponseDTO(
                tarefa.getId(),
                tarefa.getTitulo(),
                tarefa.isConcluida(),
                tarefa.getPrioridade()
        );
    }
}




//    public List<TaskResponseDTO> listarTodas(Task tarefa){
//        return new TaskResponseDTO()
//    }
//}
