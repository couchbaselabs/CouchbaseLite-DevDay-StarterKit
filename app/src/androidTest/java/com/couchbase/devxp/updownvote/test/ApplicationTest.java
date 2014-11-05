package com.couchbase.devxp.updownvote.test;

import com.couchbase.devxp.updownvote.Application;
import com.couchbase.devxp.updownvote.Presentation;
import com.couchbase.lite.CouchbaseLiteException;
import com.couchbase.lite.QueryEnumerator;

import android.test.ApplicationTestCase;

/**
 * TODO those tests will fail to start with, your job is to implement the needed logic to make them work!
 *
 * Follow the TODOs throughout the project to make it work
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public Application application;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        createApplication();
        application = getApplication();
    }

    @Override
    protected void tearDown() throws Exception {
        application.getDatabase().delete();
        super.tearDown();
    }

    public void testDatabaseConnection () {
        assertNotNull(application.getDatabase());
    }

    public void testCreatePresentation () {
        Presentation presentation = new Presentation(application.getDatabase());
        presentation.setTitle("I am a test");
        try {
            presentation.save();
        } catch (CouchbaseLiteException e) {
            fail();
        }
    }

    public void testFindAndUpdatePresentation () {
        String title = "I am a test";
        String newTitle = "I am updated";
        Presentation presentation = new Presentation(application.getDatabase());
        presentation.setTitle(title);
        try {
            presentation.save();
            QueryEnumerator presentations = Presentation.findAll(application.getDatabase()).run();
            Presentation loaded = Presentation.from(presentations.getRow(0).getDocument());
            loaded.setTitle(newTitle);
            loaded.save();
            Presentation loaded1 = Presentation.from(presentations.getRow(0).getDocument());
            assertEquals(loaded1.getTitle(), newTitle);
        } catch (CouchbaseLiteException e) {
            fail();
        }
    }
}