package com.projeto.task.repository;


import com.projeto.task.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private final Map<Long, User> banco = new LinkedHashMap<>();

    public User criar(User user){
        System.out.println("[REPO] Criando usuario" + user.getNome());
        banco.put(user.getId(), user);
        return user;
    }

    public List<User> listarTodos(){
        return new ArrayList<>(banco.values());
    }

    public Optional<User> buscarUserId(Long id){
        return Optional.ofNullable(banco.get(id));
    }

    public User atualizar(Long id){
        Optional<User> user=buscarUserId(id);
        if(user.isEmpty())
            return new User();
        return banco.replace(id, user.get());
    }

     public User deletar(Long id){
        Optional<User> user  = buscarUserId(id);
        if (user.isEmpty())
            return new User();
        return banco.remove(id);
     }
}
