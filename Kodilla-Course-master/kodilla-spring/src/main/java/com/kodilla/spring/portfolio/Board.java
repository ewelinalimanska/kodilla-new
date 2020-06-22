package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList doneList, TaskList inProgressList, TaskList toDoList) {
        this.doneList = doneList;
        this.inProgressList = inProgressList;
        this.toDoList = toDoList;
    }

    public List<String> getToDoList() {
        return toDoList.getTasks();
    }

    public List<String> getInProgressList() {
        return inProgressList.getTasks();
    }

    public List<String> getDoneList() {
        return doneList.getTasks();
    }
}
