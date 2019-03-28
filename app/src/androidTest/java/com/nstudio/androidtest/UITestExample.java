package com.nstudio.androidtest;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.nstudio.androidtest.activities.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


@RunWith(AndroidJUnit4.class)
public class UITestExample {

    private String email;
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);



    @Before
    public void setEmail(){
        email = "impathan007@gmail.com";
        Log.e("email set ",email);
    }

    @After
    public void emailReset(){
        email = "";
        Log.e("email Reset ",email);
    }

    @Test
    public void checkEmailOne() {
        // Type text and then press the button.
        Espresso.onView(withId(R.id.editEmail))
                .perform(typeText(email), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btnCheck)).perform(click());


    }

    @Test
    public void checkEmailTwo() {
        // Type text and then press the button.
        Espresso.onView(withId(R.id.editEmail))
                .perform(typeText(email), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btnCheck)).perform(click());

    }

    @Test
    public void checkEmailThree() {
        // Type text and then press the button.
        Espresso.onView(withId(R.id.editEmail))
                .perform(typeText(email), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btnCheck)).perform(click());

    }




}
