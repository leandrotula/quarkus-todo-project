package com.app.todo.model;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class TodoTaskEntityTest {

    @Test
    @TestTransaction
    public void test_saveTodoTask_ok() {

        final var todoTasks = new TodoTaskEntity.Builder()
                .withName("test task")
                .withReason("pay cablevision")
                .withStatus(TaskStatus.COMPLETE)
                .build();

        todoTasks.persist();

        final var taskFound = TodoTaskEntity.findById(todoTasks.id);
        Assertions.assertNotNull(taskFound);
    }
}
