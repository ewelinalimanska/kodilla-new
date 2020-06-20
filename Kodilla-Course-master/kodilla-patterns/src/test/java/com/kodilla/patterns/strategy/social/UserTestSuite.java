package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){

        //given

        User john = new Millenials("Janek");
        User chris = new YGeneration("Krzysiek");
        User paul = new ZGeneration("Paweł");

        //when

        String johnShare = john.sharePost();
        System.out.println("Janek publikuje na " + johnShare);
        String chrisShare = chris.sharePost();
        System.out.println("Krzysiek publikuje na " + chrisShare);
        String paulShare = paul.sharePost();
        System.out.println("Pawel publikuje na "+ paulShare);

        //then

        Assert.assertEquals("Facebook", johnShare);
        Assert.assertEquals("Twitter", chrisShare);
        Assert.assertEquals("Snapchat", paulShare);

    }

    @Test
    public void testIndividualSharingStrategy(){

        //given

        User kate = new Millenials("Kasia");

        //when

        String kateShare = kate.sharePost();
        System.out.println("Kasia publikuje na " + kateShare);
        kate.setSocialPublisher(new SnapchatPublisher());
        kateShare = kate.sharePost();
        System.out.println("Kasia czasami lubi cos wrzucic na " + kateShare);

        // then

        Assert.assertEquals("Snapchat", kateShare);
    }
}
