package com.hexagonal.task.application.usercases;

import com.hexagonal.task.domain.models.Task;
import com.hexagonal.task.domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.task.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUserCaseImpl implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;


    public DeleteTaskUserCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
