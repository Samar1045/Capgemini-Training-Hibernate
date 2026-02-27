package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id; // Only non-primitive datatypes allowed
    private String task;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long Id){
        this.Id = Id;
    }
    public void setTask(String task){
        this.task= task;
    }
    public long getId(){
        return this.Id;
    }
    public String getTask(){
        return this.task;
    }


}
