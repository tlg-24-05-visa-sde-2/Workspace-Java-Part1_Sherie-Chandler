/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */
class AlarmClock {
    // class ("static") fields -ONE copy, shared among all instances
    // these live up in the "shared zone
    public static final int MIN_INTERVAL = 1; //they do not live inside of the objects--each object has it's own data
    public static final int MAX_INTERVAL = 20; // added min/max and static/fixed on 07/02/34

    // properties or attributes - these are called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;  // default value when client doesn't specify one (instead of 0)


    // constructors--default no argument "ctor" every class must have 1 ctor
    public AlarmClock() {
        // no-op
    }

    // functions or operations - these are called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provides "controlled access" to the object's field

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // ToDo: business data constraint - must be between 1 and 20 (inclusive)
    // If incoming value is valid, we take it; otherwise, we reject it with an error message
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= 1 && MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) { //valid input
            this.snoozeInterval = snoozeInterval; // assign to provate field
        }
        else {                                         // invalid
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". Must be between 1 and 20 (inclusive).");
            "Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " (inclusive).") // updated 07/02 day 6
        }
    }

    /*
     * Purpose: return a string (sentence) describing this object.
     */
    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}
