package com.kodilla.kodillapatterns2.facade;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Authenticator {

    public boolean isAuthenticator(Long userId) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
