package org.snooze;

/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */
class AlarmClock {
    // class ("static") fields - ONE copy, shared among all instances
    // these live up in the "shared zone"
    public static final int MIN_INTERVAL = 1; // they do not live inside of the objects--each object has its own data
    public static final int MAX_INTERVAL = 20; // added min/max and static/fixed on 07/02/34

    // properties or attributes - these are called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;  // default value when client doesn't specify one (instead of 0)

    // constructors--default no argument "ctor" every class must have 1 ctor
    public AlarmClock() {
        // no-op
    }

    // added a constructor that takes an int parameter for snoozeInterval
    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }

    // functions or operations - these are called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provides "controlled access" to the object's field
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // business data constraint - must be between 1 and 20 (inclusive)
    // If incoming value is valid, we take it; otherwise, we reject it with an error message
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " (inclusive).");
        }
    }

    /*
     * Purpose: return a string (sentence) describing this object.
     */
    public String toString() {
        return "AlarmClock: snoozeInterval = " + snoozeInterval;
    }
}

/*
 * Client-side "main-class," i.e., the class definition with main().
 * That's the ONLY thing in here.
 * We will create a few AlarmClock objects and give them a basic test-drive.
 */
