package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final String userName;
    private final int userIDNumber;
    private final char sex;
    private final LocalDate birth;
    private final int postsNumber;

    public ForumUser(String userName, int userIDNumber, char sex, LocalDate birth, int postsNumber) {
        this.userName = userName;
        this.userIDNumber = userIDNumber;
        this.sex = sex;
        this.birth = birth;
        this.postsNumber = postsNumber;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserIDNumber() {
        return userIDNumber;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", userIDNumber=" + userIDNumber +
                ", sex=" + sex +
                ", birth=" + birth +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
