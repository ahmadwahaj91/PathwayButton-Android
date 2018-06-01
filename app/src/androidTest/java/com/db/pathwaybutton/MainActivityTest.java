package com.db.pathwaybutton;

import android.test.ActivityInstrumentationTestCase2;

import customlibraries.db.com.pathwaybutton.PathwayButton;

/**
 * Instrumentation Testing of the Pathway Button using JUnit
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mTestActivity;
    private PathwayButton mPath;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mTestActivity = this.getActivity();
        mPath = mTestActivity.findViewById(R.id.pathway);
    }

    public void testPreconditions() {
        assertNotNull("mTestActivity is null", mTestActivity);
        assertNotNull("mPath is null", mPath);
    }
}