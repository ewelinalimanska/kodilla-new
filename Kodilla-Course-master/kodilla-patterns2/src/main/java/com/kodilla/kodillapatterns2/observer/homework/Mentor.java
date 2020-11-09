package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private String lastname;
    private int updateCount;

    public Mentor(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Tasks tasks) {
        System.out.println(name + "! New task from student " + tasks.getStudent().getStudentName() +
                ". Total tasks to check: " + tasks.getTasks().size());
        updateCount++;
    }
}
