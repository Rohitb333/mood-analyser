package com.java.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    @Test
    public void analyseSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }

    @Test
    public void analyseHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Happy Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }

    @Test
    public void analyseNull() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage(null);
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }
}
