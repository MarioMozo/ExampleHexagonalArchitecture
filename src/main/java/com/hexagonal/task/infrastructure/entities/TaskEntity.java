package com.hexagonal.task.infrastructure.entities;

import com.hexagonal.task.domain.models.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private Boolean completed;

    public  TaskEntity(){    }
    public TaskEntity(Long id, String title, String description, LocalDateTime creationDate, Boolean completed){
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.completed = completed;

    }
    //Metodo estatico para darle a estos parametros los valores del dominio de la clase Task
    // Se puede sustituir con un Map

    public static TaskEntity fromDomainModel(Task task){
        return new TaskEntity(task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getCreationDate(),
                task.getCompleted());
    }

    //Este metodo equivale a Setear
    public Task toDomainModel(){
        return new Task(id, title, description, creationDate, completed);
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
