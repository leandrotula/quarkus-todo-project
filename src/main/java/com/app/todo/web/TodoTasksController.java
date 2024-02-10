package com.app.todo.web;

import com.app.todo.service.TodoService;
import com.app.todo.web.model.TodoTaskPayload;
import com.app.todo.web.model.TodoTaskResponse;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/tasks")
public class TodoTasksController {

    @Inject
    TodoService todoService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public TodoTaskResponse save(final @Valid TodoTaskPayload todoTaskPayload) {

        return todoService.persist(todoTaskPayload);
    }


}
