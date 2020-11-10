package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookStatistic;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {

    //daje

    Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {

        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianPublicationYear(books);
    }
}
