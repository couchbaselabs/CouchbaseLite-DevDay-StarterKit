package com.couchbase.devxp.updownvote;

import com.couchbase.lite.Database;

public class Application extends android.app.Application {
    public static String TAG = "UpVoteDownVote";
    // Reference to the sync gateway to use, this should be your local one unless you are running it in the "cloud"
    private static final String SYNC_URL_HTTP = "http://localhost:4984/db";
    private Database database = null;

    public Database getDatabase() {
        // TODO establish the connection to the Database
        // HINT http://developer.couchbase.com/mobile/develop/training/build-first-android-app/ if you need help!
        return database;
    }

    private void setupSync() {
        // TODO create a push and a pull replication with the SYNC_URL_HTTP specified sync gateway
        // TODO monitor the replication via a Replication.ChangeListener
    }

    @Override
    public void onCreate() {
        // TODO Load up the database on start
        setupSync();

        super.onCreate();
    }

}
