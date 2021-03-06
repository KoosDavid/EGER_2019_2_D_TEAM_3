package com.example.mediaplayer.activities;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import com.example.mediaplayer.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;
import static android.support.test.espresso.Espresso.onView;


public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule= new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity=null;


    @Before
    public void setUp() throws Exception {

        mActivity=mActivityTestRule.getActivity();
    }

    @Test
    public void test1() {
        View view=mActivity.findViewById(R.id.mini_player_title);
        assertNotNull(view);
    }

    @Test
    public void test2(){
        mActivityTestRule.launchActivity(new Intent());

        onView(withId(R.id.mini_player_image)).perform(click());
    }


    @Test
    public void test3(){
        mActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.action_search)).perform(click());
    }

    @Test
    public void test4(){
        mActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.mini_player)).perform(click());
    }


    @Test
    public void testPause(){
        mActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.mini_player)).perform(click());
        onView(withId(R.id.pause)).perform(click());
    }
    @Test
    public void testPlay(){
        mActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.action_plus)).perform(click());
    }

    @After
    public void tearDown() throws Exception {

        mActivity=null;
    }


}