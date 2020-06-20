package com.kodilla.good.patterns.challenges.shop;

public class SMSService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Send email to: " + user);
    }
}
