/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;


class DateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        // testNow();
       // testCreate();
        // testParse();
        // testFormat();
    }

    /**
     * TASK: create current date, time, and date-time via now() and then print them.
     */
    public static void testNow() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println();
        LocalTime now = LocalTime.now().withNano(0);
        System.out.println();

        LocalDateTime timestamp = LocalDateTime.now().withNano(0);
        System.out.println(timestamp);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testCreate() {
        // create your birthday via of(). What day of the week were you born on?
        LocalDate bday = LocalDate.of(2020, 1, 1);
        System.out.println(bday.getDayOfWeek());

        // TODO: use of() to create a value representing the 1st lunar landing -
        //  it happened on 7/20/69 at 3:18pm Eastern Time.
        // NOTE: ignore time-zone, just assume Eastern Time is the local time.
        LocalDateTime moonLanding = LocalDateTime.of(1969, 7, 20, 18, 18);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testParse() {
        // create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
        LocalDate bday = LocalDate.parse("1987-01-01");

        // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
    }

    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    public static void testFormat() {
        LocalDate hastings = LocalDate.of(1066, 10, 14);

        // TODO: 10/14/1066

        // TODO: 14-10-1066

        // OPTIONAL: October 14, 1066
    }
}
