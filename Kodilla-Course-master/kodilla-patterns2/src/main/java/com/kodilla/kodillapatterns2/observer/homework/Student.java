package com.kodilla.kodillapatterns2.observer.homework;

public class Student {

    private String studentName;
    private String login;

    public String getStudentName() {
        return studentName;
    }

    public String getLogin() {
        return login;
    }

    public Student(String name, String login) {
        this.studentName = name;
        this.login = login;
    }
}
