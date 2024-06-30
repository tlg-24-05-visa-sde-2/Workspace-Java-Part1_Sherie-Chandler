/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */
class AlarmClock {
    // properties or attributes - these are called "instance variables" or "fields" in Java
    int snoozeInterval = 5;  // default value when client doesn't specify one (instead of 0)

    // functions or operations - these are called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }

    // accessor method - provides "controlled access" to the object's field

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // ToDo: implement constraint - must be between 10 and 20 (incusive)
    //if incoming value is "valid," we take it, i.e. assign to the private field
    // otherwise, we reject it with an error message

    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }

    /*
     * Purpose: return a string (sentence) describing this object.
     */

    public String toString() {
        return "This alarm clock snoozes for " + snoozeInterval + " minutes";
    }
}