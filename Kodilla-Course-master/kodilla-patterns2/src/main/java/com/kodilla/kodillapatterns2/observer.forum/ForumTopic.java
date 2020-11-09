package com.kodilla.kodillapatterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable {

    private final List<Observer> observers;

    private final List<String> messages;

    private final String name;

    public ForumTopic(String name) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post){
        messages.add(post);
        notifyObservers(); //wysyla info po dodaniu nowego posta
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        } //wywoluje update u kazdego z obserwatorow
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
