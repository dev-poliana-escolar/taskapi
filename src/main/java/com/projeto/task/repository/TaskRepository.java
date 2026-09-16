package com.projeto.task.repository;

import com.projeto.task.model.Task;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TaskRepository {
    private final Map<Long, Task> banco = new LinkedHashMap<>();
    private final AtomicLong sequencia = new AtomicLong();

    public Task salvar(Task task) {
        System.out.println("[REPOSITORY] Salvando tarefa em memória: " + task.getTitulo());
        banco.put(task.getId(), task);
        return task;
    }
    public List<Task> listarTodas() {
        System.out.println("[REPOSITORY] Buscando todas as tarefas em memória");
        return new ArrayList<>(banco.values());
    }

    public Optional<Task> buscarPorId(Long id) {
        System.out.println("[REPOSITORY] Buscando tarefa por id: " + id);
        return Optional.ofNullable(banco.get(id));
    }
}