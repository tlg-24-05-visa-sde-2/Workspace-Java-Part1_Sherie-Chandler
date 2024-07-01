/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */
class AlarmClock {
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
        if (snoozeInterval >= 1 && snoozeInterval <= 20) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". Must be between 1 and 20 (inclusive).");
        }
    }

    /*
     * Purpose: return a string (sentence) describing this object.
     */
    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}
