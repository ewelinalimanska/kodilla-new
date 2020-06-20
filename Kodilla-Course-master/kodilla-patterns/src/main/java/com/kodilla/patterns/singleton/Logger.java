package com.kodilla.patterns.singleton;

public final class Logger {
    private String lastLog = "";
    private static Logger loggerInstance = null;

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }

    public static Logger getInstance(){
        if (loggerInstance == null){
            loggerInstance = new Logger();
                }
        return loggerInstance;
    }
}
