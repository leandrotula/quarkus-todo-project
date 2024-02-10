package com.app.todo.service;

import com.app.todo.model.TodoTaskEntity;
import com.app.todo.web.model.TodoTaskPayload;
import com.app.todo.web.model.TodoTaskResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TodoService {

    @Transactional
    public TodoTaskResponse persist(TodoTaskPayload todoTaskPayload) {

        var todoTask = new TodoTaskEntity.Builder()
                .withStatus(todoTaskPayload.taskStatus)
                .withReason(todoTaskPayload.taskReason)
                .withName(todoTaskPayload.taskName)
                .build();
        todoTask.persist();

        return new TodoTaskResponse(todoTask.id, todoTask.name, todoTask.status);
    }
}
