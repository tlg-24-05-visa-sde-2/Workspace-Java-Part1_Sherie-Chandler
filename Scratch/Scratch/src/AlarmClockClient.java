/*
 * Client-side "main-class," i.e., the class definition with main().
 * That's the ONLY thing in here.
 * We will create a few AlarmClock objects and give them a basic test-drive.
 */
class AlarmClockClient {

    // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        // create an instance (or object) of AlarmClock and set its snoozeInterval
        AlarmClock clock1 = new AlarmClock(); // updated to "10"--you can't call methods that don't exist in Java (it is in the compiled class file).

        // clock1.snoozeInterval = 7; // this will be disallowed next week

        // create a 2nd AlarmClock object via its snoozeInterval ctor (do it in one shot)
        AlarmClock clock2 = new AlarmClock(); // when you say new you are calling a constructor
        clock2.setSnoozeInterval(10);

        // create a 3rd AlarmClock object, but this time DON'T give it a snoozeInterval
        AlarmClock clock3 = new AlarmClock(AlarmClock.MAX_INTERVAL); // as long as possible

        // make them snooze()
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        // toString()
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3.toString());
    }
}
