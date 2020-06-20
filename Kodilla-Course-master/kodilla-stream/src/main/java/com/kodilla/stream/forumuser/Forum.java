package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser("User01212", 01212, 'M', LocalDate.of(2000, 10, 18), 23));
        userList.add(new ForumUser("User01313", 01313, 'F', LocalDate.of(2001, 1, 2), 3));
        userList.add(new ForumUser("User1414", 01414, 'M', LocalDate.of(1994, 9, 12), 90));
        userList.add(new ForumUser("User01515", 01515, 'M', LocalDate.of(1999, 4, 15), 95));
        userList.add(new ForumUser("User01616", 01616, 'M', LocalDate.of(1980, 12, 30), 9));
        userList.add(new ForumUser("User1717", 01717, 'F', LocalDate.of(2003, 11, 25), 44));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
