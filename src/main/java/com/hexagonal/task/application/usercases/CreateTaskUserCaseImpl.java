package com.hexagonal.task.application.usercases;

import com.hexagonal.task.domain.models.Task;
import com.hexagonal.task.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.task.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUserCaseImpl implements CreateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;
    public CreateTaskUserCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }
    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
