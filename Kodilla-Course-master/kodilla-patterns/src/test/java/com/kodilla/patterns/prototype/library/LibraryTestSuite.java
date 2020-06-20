package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //given
        Library library = new Library("Library 1.");
        for (int n = 1; n <= 3; n++){
            Book book1 = new Book("Title" + n, "Author" + n, LocalDate.of(2010, 1, 4));
            library.getBooks().add(book1);
        }
        Book bookToRemove = new Book("Book to remove", "Author xx", LocalDate.of(2012, 12, 12));
        library.getBooks().add(bookToRemove);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2.");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3.");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when

        library.getBooks().remove(bookToRemove);

        //then

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
