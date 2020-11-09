package com.kodilla.kodillapatterns2.observer.forum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate(){

        //given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);

        //when
        javaHelpForum.addPost("Hi everyone! Could you help me with the loop?");
        javaHelpForum.addPost("Better try use while loop in this case.");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("Help pls, my MYSQL do doesn't want to work :(");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message.");

        //then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }

}
