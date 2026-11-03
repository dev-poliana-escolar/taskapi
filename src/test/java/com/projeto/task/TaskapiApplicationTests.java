package com.projeto.task;

import com.projeto.task.model.Prioridade;
import com.projeto.task.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskapiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void saveTask(){
        Task tarefa = new Task();
        tarefa.setTitulo("Organizar as marmitas da semana");
        tarefa.setPrioridade(Prioridade.ALTA);
        tarefa.setDescricao("Fazer macarronada de sardinha");
        tarefa.setId(1L);

        assertEquals(tarefa.getId() > 0, true);
        assertEquals(tarefa.getTitulo().length() <= 100, true);
        assertEquals(tarefa.getPrioridade() == Prioridade.ALTA, true);
        assertEquals(tarefa.isConcluida(), false);

//        carro.setModelo("modelo");
//        carro.setAno(1990);
//        carro.setId(1L);
//        carro.setPreco(10000);
//        assertEquals(carro.getAno() > 1980, true);
//        assertEquals(carro.getAno() > 2026, false);
//        assertEquals(carro.getPreco() > 0, true);
//        assertEquals(carro.getId() > 0, true);
    }

}
