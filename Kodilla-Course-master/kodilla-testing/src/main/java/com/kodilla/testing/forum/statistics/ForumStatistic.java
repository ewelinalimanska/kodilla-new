package com.kodilla.testing.forum.statistics;

public class ForumStatistic {

    private int forumUsers;
    private int forumPostsNumber;
    private int forumCommentsNumber;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics ) {

        forumUsers = statistics.usersNames().size();
        forumPostsNumber = statistics.postsCount();
        forumCommentsNumber = statistics.commentsCount();

        if (statistics.usersNames().size() != 0){
            averagePostsPerUser = forumPostsNumber / forumUsers;
        }else{
            averagePostsPerUser = 0;
        }
        if (statistics.usersNames().size() != 0) {
            averageCommentsPerUser = forumCommentsNumber / forumUsers;
        }else{
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount() != 0) {
            averageCommentsPerPost = forumCommentsNumber / forumPostsNumber;
        }else{
            averageCommentsPerPost = 0;
        }
    }

    public int getForumUsers() {
        return forumUsers;
    }

    public int getForumPostsNumber() {
        return forumPostsNumber;
    }

    public int getForumCommentsNumber() {
        return forumCommentsNumber;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void showStatistics(){
        System.out.println("Current number of forum users: " + forumUsers);
        System.out.println("Current number of posts on forum: " + forumPostsNumber);
        System.out.println("Current number of comments on forum: " + forumCommentsNumber);
        System.out.println("Current average of posts per user on forum: " + averagePostsPerUser);
        System.out.println("Current average of comments per user on forum: " + averageCommentsPerUser);
        System.out.println("Current average of comments per post on forum: " + averageCommentsPerPost);
    }
}
