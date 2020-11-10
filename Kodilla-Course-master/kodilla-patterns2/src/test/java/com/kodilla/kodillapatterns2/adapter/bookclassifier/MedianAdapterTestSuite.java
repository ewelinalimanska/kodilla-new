package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){

        //given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Book1", 1990, "Signature1"));
        bookSet.add(new Book("Author2", "Book2", 1992, "Signature2"));
        bookSet.add(new Book("Author3", "Book3", 1998, "Signature3"));
        bookSet.add(new Book("Author4", "Book4", 2000, "Signature4"));

        //when
        int result = medianAdapter.publicationYearMedian(bookSet);

        //then
        assertEquals(1998, result);
    }
}
