package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuit {

    @Test
    public void testUpdate(){

        //given
        Student klara = new Student("Klara", "Klara123");
        Student rick = new Student("Rick", "Rick666");
        Student morty = new Student("Morty", "Morty000");

        Mentor alex = new Mentor("Alex", "Snow");
        Mentor mia = new Mentor("Mia", "Sun");

        Tasks klarasTask = new Tasks(klara);
        Tasks ricksTask = new Tasks(rick);
        Tasks mortysTask = new Tasks(morty);

        klarasTask.registerObserver(alex);
        ricksTask.registerObserver(alex);
        mortysTask.registerObserver(mia);

        //when
        klarasTask.addTask(new Task("AOP", 21, "I have problem with this exercise :("));
        klarasTask.addTask(new Task("Observer", 24, "Everything works"));
        ricksTask.addTask(new Task("Individual project", 12, "My first application"));
        mortysTask.addTask(new Task("Spring WEB", 18, "I don't understand this module"));

        //then
        assertEquals(3, alex.getUpdateCount());
        assertEquals(1, mia.getUpdateCount());
    }
}
