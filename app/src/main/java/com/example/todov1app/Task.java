package com.example.todov1app;

import java.io.Serializable;

public class Task implements Serializable {
    String name, description;
    String priority;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.priority = "Medium";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return getName() + "(" + priority + ")";
    }
}
