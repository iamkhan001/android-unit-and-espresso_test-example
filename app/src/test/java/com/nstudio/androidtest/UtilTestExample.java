package com.nstudio.androidtest;

import com.nstudio.androidtest.utils.Utils;

import junit.framework.TestCase;

import org.junit.Assert;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;

//class to unit test class

public class UtilTestExample extends TestCase {
    public void testIsEmailValid() {
        String testEmail = "anupamchugh";
        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), Utils.checkEmailForValidity(testEmail), is(true));
    }

    public void testCheckDateWasConvertedCorrectly() {
        long inMillis = System.currentTimeMillis();
        Date date = Utils.calendarDate(inMillis);
        Assert.assertEquals("Date time in millis is wrong", inMillis * 100, date.getTime());
    }
}
