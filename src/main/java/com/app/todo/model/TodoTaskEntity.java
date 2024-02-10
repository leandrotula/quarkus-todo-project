package com.app.todo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.time.Instant;

@Entity
public class TodoTaskEntity extends PanacheEntity {
    public String name;
    public Instant createdDate;
    public TaskStatus status;
    public String reason;

    public TodoTaskEntity() {}

    private TodoTaskEntity(Builder builder) {
        this.name = builder.name;
        this.createdDate = builder.createdDate;
        this.status = builder.status;
        this.reason = builder.reason;
    }

    public static class Builder {
        private String name;
        private Instant createdDate;
        private TaskStatus status;
        private String reason;

        public Builder() {}

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCreatedDate(Instant createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder withStatus(TaskStatus status) {
            this.status = status;
            return this;
        }

        public Builder withReason(String reason) {
            this.reason = reason;
            return this;
        }

        public TodoTaskEntity build() {
            return new TodoTaskEntity(this);
        }
    }
}
