package com.kodilla.kodillapatterns2.observer.homework;

public class Task {

    private String taskName;
    private int taskNumber;
    private String description;

    public Task(String taskName, int taskNumber, String description) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.description = description;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public String getDescription() {
        return description;
    }
}
