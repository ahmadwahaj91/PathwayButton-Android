package com.db.pathwaybutton;

import android.test.AndroidTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import customlibraries.db.com.pathwaybutton.PathwayButton;

/**
 * Unit Testing of the Pathway Button using Mockito Framework
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testPathwayButton() throws Exception {
        final MainActivity mainActivity = Mockito.spy(new MainActivity());
        final PathwayButton pathwayButton = Mockito.mock(PathwayButton.class);

        assertNotNull("mTestActivity is null", mainActivity);
        assertNotNull("Pathway Button", pathwayButton);

        if (pathwayButton.isEnabled()) {
            boolean clickable = pathwayButton.isClickable();
            assertTrue(clickable);
        }
    }
}