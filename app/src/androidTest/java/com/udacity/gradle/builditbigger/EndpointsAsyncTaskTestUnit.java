
package com.udacity.gradle.builditbigger;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Log;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EndpointsAsyncTaskTestUnit extends AndroidTestCase{
    String TAG = EndpointsAsyncTask.class.getSimpleName();
   @Rule
    public ActivityTestRule mActivityRule =
            new ActivityTestRule(MainActivity.class);



   @Test
   public void testJokeIsNotEmpty() throws Exception {

       Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
       String joke = null;
       EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
       endpointsAsyncTask.execute();
       try {
           joke = endpointsAsyncTask.get();
           Log.d(TAG, "Retrieved a non-empty string successfully: " + joke);
       } catch (Exception e) {
           e.printStackTrace();
       }
       assertNotNull(joke);


   }

    @Test
    public void testVerifyResponse() {


        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.jokes_text_view)).check(matches(isDisplayed()));
    }

}

