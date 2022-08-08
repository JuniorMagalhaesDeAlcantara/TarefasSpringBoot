package com.tarefa.registro.model;

import java.util.Date;

public class Task {
    
    private Long id;
    private String name;
    private Date date;

    public Task(Long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Task() {
        
    }
    
    public void setId(Long id){
        this.id =id;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }
}
