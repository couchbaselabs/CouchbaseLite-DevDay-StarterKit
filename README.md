Up Down Vote App Starter Kit
============================

This is the starting point for the app developed at the Mobile Developer Day for
Couchbase Lite on Android. The end result will look something like this:

![Screenshot](https://raw.githubusercontent.com/couchbaselabs/Developer-Day/mobile-code/mobile/code/up_down_vote_screenshot.png)

The app manages a simple list of "Presentations" like the ones given at the
developer day, and lets all the people connected to the same sync gateway vote
on them (Thumbs up / Thumbs down).

Setup
----
Clone down the Repository, and import into android Studio. The app is Runnable
against API level 19, which means KitKat. Lollipop is not supported by Couchbase
Lite, as of right now.

Now all you need todo is either have a sync_gateway in the cloud, or run one
locally via the included config

    $ sync_gateway up_down_vote/sync_gateway.json

The URL is set in the Application Class.

The Workshop
-----------
Throughout the project you will find TODOs at places where something needs to be
implemented. When all of this is done the tests included should pass and the app
will work on the emulator and any Android KitKat device (I think).

Happy coding!



