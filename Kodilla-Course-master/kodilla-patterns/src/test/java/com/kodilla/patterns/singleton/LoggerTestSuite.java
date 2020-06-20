package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLastLog(){

        Logger.getInstance().log("Test log");

        String testLog = Logger.getInstance().getLastLog();

        Assert.assertEquals("Test log", testLog);
    }
}
