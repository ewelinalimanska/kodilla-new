package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {


    @Autowired
    @Qualifier("toDoList")
    TaskList taskList;
    @Bean
    public Board getBoard(){
        return new Board(createDoneList(), createInProgressList(), createToDoList());
    }
    @Bean (name = "toDoList")
    @Scope("prototype")
    public TaskList createToDoList(){
        List<String> toDoList = new ArrayList<>();
        return new TaskList(toDoList);
    }

    @Bean (name = "inProgressList")
    @Scope("prototype")
    public TaskList createInProgressList(){
        List<String> inProgressList = new ArrayList<>();
        return new TaskList(inProgressList);
    }

    @Bean (name = "DoneList")
    @Scope("prototype")
    public TaskList createDoneList(){
        List<String> doneList = new ArrayList<>();
        return new TaskList(doneList);
    }

}
