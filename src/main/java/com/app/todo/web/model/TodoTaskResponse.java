package com.app.todo.web.model;

import com.app.todo.model.TaskStatus;

public class TodoTaskResponse {

    public Long taskId;
    public String taskName;

    public TaskStatus taskStatus;

    public TodoTaskResponse(Long taskId, String taskName, TaskStatus taskStatus) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }

    public TodoTaskResponse() {

    }

    @Override
    public String toString() {
        return "TodoTaskResponse{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskStatus=" + taskStatus +
                '}';
    }
}
