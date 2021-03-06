package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Task: " + taskName + ", by: " + using + ", is on the way to: " + where ;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (using != "BMW"){
            return true;
        } else {
            return false;
        }
    }
}
