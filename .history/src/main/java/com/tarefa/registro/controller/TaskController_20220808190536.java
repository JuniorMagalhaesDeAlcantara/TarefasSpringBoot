package com.tarefa.registro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tarefa.registro.model.Task;


@Controller
public class TaskController {
    
    @GetMapping("/create")
    public String home(){
        return "create";
    }

    @PostMapping("/create")
     public void create(Task task){
        System.out.println("O nome da tarefa é " + task.getName());
     }
    
    
}
