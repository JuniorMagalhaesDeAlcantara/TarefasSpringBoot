package com.tarefa.registro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarefa.registro.model.Task;


@Controller
public class TaskController {

    List<Task> tasks = new ArrayList<>();
    
    @GetMapping("/create")
    public String home(){
        return "create";
    }

    @PostMapping("/create")
     public String create(Task task){
        long id = tasks.size() + 1L;
        tasks.add(new Task(id, task.getName(), task.getDate()));

        return "redirect:/list";
     }
    
     @GetMapping("/list")
     public String List() {
        return "list";
     }
    
}
