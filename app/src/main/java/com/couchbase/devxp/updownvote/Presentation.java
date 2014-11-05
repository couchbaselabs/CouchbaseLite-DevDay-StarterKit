package com.couchbase.devxp.updownvote;

import com.couchbase.lite.CouchbaseLiteException;
import com.couchbase.lite.Database;
import com.couchbase.lite.Document;
import com.couchbase.lite.Query;

public class Presentation {
    // HINT create a property in the presentations so you can find them among the objects
    public static final String TYPE = "presentation";

    // TODO Create fields for createdAt, upVotes, downVotes, title

    public static Query findAll(Database database) {
        // TODO create a view with a map function listing all the presentations in the database
        return null;
    }

    public static Presentation from(Document document) {
        // TODO create a presentation object from the document passed
        // HINT make sure to save of the document to enable updating later
        return null;
    }

    public Presentation(Database database) {
        // TODO initialzie the fields
        // TODO save of a reference to the database used
    }

    public void save() throws CouchbaseLiteException {
        // TODO save a document to the database
        // TODO update a document if it has been saved before
        // HINT this needs a reference to the original document for revision, key, etc.
    }
}
