package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Tasks implements Observable {

    private final List<Observer> observers;

    private final List<Task> tasks;

    private final Student student;

    public Tasks(Student student) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.student = student;
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Student getStudent() {
        return student;
    }
}