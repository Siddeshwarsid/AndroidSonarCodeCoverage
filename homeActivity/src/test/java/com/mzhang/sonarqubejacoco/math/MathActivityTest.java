package com.mzhang.sonarqubejacoco.math;

import android.os.Build;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.mzhang.sonarqubejacoco.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@Config(sdk= Build.VERSION_CODES.O_MR1)
public class MathActivityTest {

    @Test
    public void hideButtonAfterClick() {
        ActivityScenario.launch(MathActivity.class);

        onView(withId(R.id.buttonHide)).perform(click());

        onView(withId(R.id.buttonHide)).check(matches(not(isDisplayed())));
    }

}