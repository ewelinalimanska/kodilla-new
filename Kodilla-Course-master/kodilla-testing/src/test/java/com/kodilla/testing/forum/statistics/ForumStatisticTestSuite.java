package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite {

    @Test
    public void testCalculateAdvStatistics() {
        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistic forumStatistic = new ForumStatistic();

        String a = "User";

        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(a + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(12);
        when(statisticsMock.postsCount()).thenReturn(12); // 0
        when(statisticsMock.usersNames()).thenReturn(users);

        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        int forumUsers = forumStatistic.getForumUsers();
        int forumPostsNumbers = forumStatistic.getForumPostsNumber();
        int forumCommentsNumbers = forumStatistic.getForumCommentsNumber();
        double averagePostsPerUser = forumStatistic.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistic.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistic.getAverageCommentsPerPost();

        Assert.assertEquals(100, forumUsers);
        Assert.assertEquals(12, forumPostsNumbers);
        Assert.assertEquals(12, forumCommentsNumbers);
        Assert.assertEquals(4.09, averageCommentsPerUser, 100);
        Assert.assertEquals(33.3, averagePostsPerUser, 55.8);
        Assert.assertEquals(1, averageCommentsPerPost, 7.2);
    }
    @Test
    public void testCalculateAdvStatistics0posts(){

        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistic forumStatistic = new ForumStatistic();

        String a = "User";

        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 130; i++) {
            users.add(a + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(77);
        when(statisticsMock.postsCount()).thenReturn(0); // 0
        when(statisticsMock.usersNames()).thenReturn(users);

        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        int forumUsers = forumStatistic.getForumUsers();
        int forumPostsNumbers = forumStatistic.getForumPostsNumber();
        int forumCommentsNumbers = forumStatistic.getForumCommentsNumber();
        double averagePostsPerUser = forumStatistic.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistic.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistic.getAverageCommentsPerPost();

        Assert.assertEquals(130, forumUsers);
        Assert.assertEquals(0, forumPostsNumbers);
        Assert.assertEquals(77, forumCommentsNumbers);
        Assert.assertEquals(0, averageCommentsPerUser, 100);
        Assert.assertEquals(0.1, averagePostsPerUser, 55.8);
        Assert.assertEquals(0, averageCommentsPerPost, 7.2);
    }

    @Test
    public void testCalculateAdvStatistics1000posts(){

        Statistics statisticsMock = mock(Statistics.class);

    ForumStatistic forumStatistic = new ForumStatistic();
    String a = "User";

    ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
        users.add(a + i);
    }

    when(statisticsMock.commentsCount()).thenReturn(766);
    when(statisticsMock.postsCount()).thenReturn(1000);
    when(statisticsMock.usersNames()).thenReturn(users);

        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

    int forumUsers = forumStatistic.getForumUsers();
    int forumPostsNumbers = forumStatistic.getForumPostsNumber();
    int forumCommentsNumbers = forumStatistic.getForumCommentsNumber();
    double averagePostsPerUser = forumStatistic.getAveragePostsPerUser();
    double averageCommentsPerUser = forumStatistic.getAverageCommentsPerUser();
    double averageCommentsPerPost = forumStatistic.getAverageCommentsPerPost();

    assertEquals(100, forumUsers, 0);
    assertEquals(1000, forumPostsNumbers, 0);
    assertEquals(766, forumCommentsNumbers, 0);
    assertEquals(10, averagePostsPerUser, 0);
    assertEquals(7, averageCommentsPerUser, 0);
    assertEquals(0, averageCommentsPerPost, 0);
}

    @Test
    public void testCalculateAdvStatistics0comments(){

        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistic forumStatistic = new ForumStatistic();
        String a = "User";

        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 673; i++) {
            users.add(a + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(530); // 0
        when(statisticsMock.usersNames()).thenReturn(users);

        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        int forumUsers = forumStatistic.getForumUsers();
        int forumPostsNumbers = forumStatistic.getForumPostsNumber();
        int forumCommentsNumbers = forumStatistic.getForumCommentsNumber();
        double averagePostsPerUser = forumStatistic.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistic.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistic.getAverageCommentsPerPost();

        Assert.assertEquals(673, forumUsers);
        Assert.assertEquals(530, forumPostsNumbers);
        Assert.assertEquals(0, forumCommentsNumbers);
        Assert.assertEquals(3, averagePostsPerUser, 54);
        Assert.assertEquals(2.1, averageCommentsPerUser, 90.0);
        Assert.assertEquals(4.9, averageCommentsPerPost, 4.9);
    }
    @Test
    public void testCalculateAdvStatisticsLessComments(){

        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistic forumStatistic = new ForumStatistic();
        String a = "User";

        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(a + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(13);
        when(statisticsMock.postsCount()).thenReturn(77); // 0
        when(statisticsMock.usersNames()).thenReturn(users);

        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        int forumUsers = forumStatistic.getForumUsers();
        int forumPostsNumbers = forumStatistic.getForumPostsNumber();
        int forumCommentsNumbers = forumStatistic.getForumCommentsNumber();
        double averagePostsPerUser = forumStatistic.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistic.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistic.getAverageCommentsPerPost();

        Assert.assertEquals(100, forumUsers);
        Assert.assertEquals(77, forumPostsNumbers);
        Assert.assertEquals(13, forumCommentsNumbers);
        Assert.assertEquals(2.6, averagePostsPerUser, 54);
        Assert.assertEquals(0.1, averageCommentsPerUser, 90.0);
        Assert.assertEquals(0.09, averageCommentsPerPost, 4.9);
    }
    @Test
    public void testCalculateAdvStatisticsMoreComments(){

        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistic forumStatistic = new ForumStatistic();
        String a = "User";

        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            users.add(a + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(1090);
        when(statisticsMock.postsCount()).thenReturn(530); // 0
        when(statisticsMock.usersNames()).thenReturn(users);

        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        int forumUsers = forumStatistic.getForumUsers();
        int forumPostsNumbers = forumStatistic.getForumPostsNumber();
        int forumCommentsNumbers = forumStatistic.getForumCommentsNumber();
        double averagePostsPerUser = forumStatistic.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistic.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistic.getAverageCommentsPerPost();

        Assert.assertEquals(200, forumUsers);
        Assert.assertEquals(530, forumPostsNumbers);
        Assert.assertEquals(1090, forumCommentsNumbers);
        Assert.assertEquals(0.12, averagePostsPerUser, 54);
        Assert.assertEquals(0, averageCommentsPerUser, 90.0);
        Assert.assertEquals(0, averageCommentsPerPost, 4.9);
    }
    @Test
    public void testCalculateAdvStatisticsZeroUsers(){

        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistic forumStatistic = new ForumStatistic();
        String a = "User";

        ArrayList<String> users = new ArrayList<>();

        when(statisticsMock.commentsCount()).thenReturn(90);
        when(statisticsMock.postsCount()).thenReturn(50); // 0
        when(statisticsMock.usersNames()).thenReturn(users);

        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        int forumUsers = forumStatistic.getForumUsers();
        int forumPostsNumbers = forumStatistic.getForumPostsNumber();
        int forumCommentsNumbers = forumStatistic.getForumCommentsNumber();
        double averagePostsPerUser = forumStatistic.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistic.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistic.getAverageCommentsPerPost();

        Assert.assertEquals(0, forumUsers);
        Assert.assertEquals(50, forumPostsNumbers);
        Assert.assertEquals(90, forumCommentsNumbers);
        Assert.assertEquals(0.1, averagePostsPerUser, 54);
        Assert.assertEquals(0.3, averageCommentsPerUser, 90.0);
        Assert.assertEquals(0, averageCommentsPerPost, 4.9);
    }
    @Test
    public void testCalculateAdvStatistics1000users(){

        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistic forumStatistic = new ForumStatistic();
        String a = "User";

        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            users.add(a + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(848484);
        when(statisticsMock.postsCount()).thenReturn(5000); // 0
        when(statisticsMock.usersNames()).thenReturn(users);

        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();

        int forumUsers = forumStatistic.getForumUsers();
        int forumPostsNumbers = forumStatistic.getForumPostsNumber();
        int forumCommentsNumbers = forumStatistic.getForumCommentsNumber();
        double averagePostsPerUser = forumStatistic.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistic.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistic.getAverageCommentsPerPost();

        Assert.assertEquals(1000, forumUsers);
        Assert.assertEquals(5000, forumPostsNumbers);
        Assert.assertEquals(848484, forumCommentsNumbers);
        Assert.assertEquals(0.13, averagePostsPerUser, 54);
        Assert.assertEquals(848, averageCommentsPerUser, 90.0);
        Assert.assertEquals(169, averageCommentsPerPost, 4.9);
    }
}


