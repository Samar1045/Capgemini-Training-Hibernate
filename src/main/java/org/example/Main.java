package org.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Just a Demo to create Table
//        System.out.println("Starting JPA...");
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("taskPU");
//
//        System.out.println("EntityManagerFactory created successfully!");
//        emf.close();
//        System.out.println("Closed successfully!");

        //Hibernate Main Implementation starts from here

        TaskDAO taskDAO = new TaskDAO();
        Task task1 = new Task();

        task1.setTask("Learn Hibernate");
        task1.setDescription("Complete Hibernate tutorial");
        taskDAO.create(task1);

        Task task2 = new Task();
        task2.setTask("Build Rest API");
        task2.setDescription("Create REST API with Spring Boot");
        taskDAO.create(task2);

        Task task3 = new Task();
        task3.setTask("Database Optimization");
        task3.setDescription("Optimize data queries and index");
        taskDAO.create(task3);

        System.out.println("\n-----READ: Getting a single task by ID----");
        TaskDTO readTask = taskDAO.read(1L);
        if(readTask!=null){
            System.out.println("Retrieved Task: "+readTask);
        }

        System.out.println("\n----LIST: Getting all tasks----");
        List<TaskDTO> allTasks = taskDAO.getAllTasks();
        System.out.println("All tasks in database");
        for(TaskDTO dto: allTasks){
            System.out.println(dto);
        }

        System.out.println("\n-----UPDATE: Updating the tasks in the database");
        TaskDTO updateTask = taskDAO.update(1L,"Learn Advanced Hibernate","Complete Advanced mapping");
        System.out.println("Updated task: "+updateTask);


        System.out.println("-----DELETE: Remove the tasks from the database");
        boolean deleted = taskDAO.delete(2L);
        System.out.println("Deleted; "+deleted);

        taskDAO.close();


    }
}