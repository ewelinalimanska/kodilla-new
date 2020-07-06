package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test: List name";
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    public void testFindByListName(){

        //given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //when
        taskListDao.save(taskList);

        //then
        String listname = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(listname);
        Assert.assertEquals(2, readTaskList.size());

        //cleanUp

    }
}
