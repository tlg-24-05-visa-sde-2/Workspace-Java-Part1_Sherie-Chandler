// Does the validation test work in all cases?
/* This is so confusing--don't forget your whiteboard assignment tonight
 * This is a client-side main-class focused only on testing setSnoozeInterval().
 * We will do BVT (Boundary Value Testing):
 * Any defects will be sniffed out on the edges of the valid range.
 * We test 0, 1, 20, and 21.
 * We test on each boundary, and just outside it.
 */

class AlarmClockValidationTest {

    public static void main(String[] args) {
        // make alarm clock and then set the snoozeInterval to 1
        AlarmClock alarmClock = new AlarmClock();

        alarmClock.setSnoozeInterval(1); // value should "stick", no error message
        System.out.println(alarmClock);
        System.out.println();

        alarmClock.setSnoozeInterval(20); // value should "stick", no error message
        System.out.println(alarmClock.getSnoozeInterval());
        System.out.println();

        alarmClock.setSnoozeInterval(0); // error message, value rejected (so it's still 20)
        System.out.println(alarmClock);
        System.out.println();

        alarmClock.setSnoozeInterval(21); // error message, value rejected (so it is still 20)
        System.out.println(alarmClock);
        System.out.println();

    }
}
