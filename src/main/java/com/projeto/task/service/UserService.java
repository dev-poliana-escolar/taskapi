package com.projeto.task.service;

import com.projeto.task.dto.UserRequestDTO;
import com.projeto.task.dto.UserResponseDTO;
import com.projeto.task.model.User;
import com.projeto.task.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    //cadastrar
    public UserResponseDTO cadastrar (UserRequestDTO dto){
        User user = new User(dto.nome(), dto.email(), dto.cargo());
        User salvo = repository.criar(user);
        return toResponseDTO(salvo);
    }
    //listar
    public List<UserResponseDTO> listarTodos(){
        return repository.listarTodos()
                .stream()
                .map(this::toResponseDTO)
                .toList();
    }


    private UserResponseDTO toResponseDTO(User user){
        return new UserResponseDTO(user.getId(),
                user.getNome(),
                user.getEmail(),
                user.getCargo()
                );
    }

}
