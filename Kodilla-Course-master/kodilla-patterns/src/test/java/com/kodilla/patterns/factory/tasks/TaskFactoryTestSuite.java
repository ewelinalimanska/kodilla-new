package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShopping(){

        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //then
        assert shopping != null;
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testDriving(){

        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //then
        assert driving != null;
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testPainting(){

        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //then
        assert painting != null;
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("Painting", painting.getTaskName());
    }
}
