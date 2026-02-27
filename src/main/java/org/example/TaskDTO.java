package org.example;

public class TaskDTO {
    private Long id;
    private String task;
    private String description;
    //Default Constructor
    public TaskDTO(){

    }
    // Constructor with all fields
    public TaskDTO(Long id, String task,String description){
        this.id=id;
        this.task= task;
        this.description= description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
