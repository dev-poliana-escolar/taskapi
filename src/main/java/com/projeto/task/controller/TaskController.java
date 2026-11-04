package com.projeto.task.controller;

import com.projeto.task.dto.TaskResponseDTO;
import com.projeto.task.dto.TaskResquestDTO;
import com.projeto.task.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service){this.service = service;}

    @PostMapping
    public ResponseEntity<TaskResponseDTO> criar(@RequestBody @Valid TaskResquestDTO corpo){
        TaskResponseDTO criada = service.criar(corpo);
        return ResponseEntity.ok(criada); //colocar listar no service
    }
}
