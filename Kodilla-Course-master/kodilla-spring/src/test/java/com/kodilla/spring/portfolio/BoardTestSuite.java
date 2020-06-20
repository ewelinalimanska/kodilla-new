package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        String task1 = "To do task";
        String task2 = "In progress task";
        String task3 = "Done task";

        board.getToDoList().add(task1);
        board.getInProgressList().add(task2);
        board.getDoneList().add(task3);

        Assert.assertEquals(task1, board.getToDoList().get(0));
        Assert.assertEquals(task2, board.getInProgressList().get(0));
        Assert.assertEquals(task3, board.getDoneList().get(0));

    }
}
