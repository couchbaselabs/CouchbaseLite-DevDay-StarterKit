package com.couchbase.devxp.updownvote;

import com.couchbase.lite.CouchbaseLiteException;
import com.couchbase.lite.Database;
import com.couchbase.lite.Document;
import com.couchbase.lite.Query;

import java.util.Date;

public class Presentation {
    // HINT create a property in the presentations so you can find them among the objects
    public static final String TYPE = "presentation";

    private Date createdAt;
    private int upVotes = -10;
    private int downVotes = -10;
    private String title;
    private Document sourceDocument;
    private Database database;

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Document getSourceDocument() {
        return sourceDocument;
    }

    public void setSourceDocument(Document sourceDocument) {
        this.sourceDocument = sourceDocument;
    }
}
