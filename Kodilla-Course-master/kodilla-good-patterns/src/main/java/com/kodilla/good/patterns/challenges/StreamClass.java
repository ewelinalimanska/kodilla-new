package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class StreamClass {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .map(m -> m.getValue())
                .flatMap(m -> m.stream())
                .collect(Collectors.joining("!"));
        System.out.println(movies);
    }
}
