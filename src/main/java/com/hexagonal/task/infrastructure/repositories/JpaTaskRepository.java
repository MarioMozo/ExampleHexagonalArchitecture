package com.hexagonal.task.infrastructure.repositories;

import com.hexagonal.task.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRespository, siempre va con la entidad que se le va a pasar seguido de coma, con el valor por el cual se va a encontrar Long id
@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
