package com.kodilla.kodillapatterns2.observer.forum;

public interface Observable {

    void registerObserver(Observer observer);//pozwala na subskrypcje

    void notifyObservers();//wysyła powiadomienia do wszystkich obserwatorów o tym, że pojawil sie post

    void removeObservers(Observer observer);//wypisanie sie z subskrypcji

}
