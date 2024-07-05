/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 *
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Note: supported displays are" + Arrays.toString(DisplayType.values());
            String note2 = "The valid range for volume is " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME;
            String note3 = "Brand must be Sony, Samsung, LG, Toshiba";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        // step 1: convert arguement strings into proper types for television
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        // step 2: create an instance of television with these converted values
        Television tv = new Television(brand, volume, display);

        // step 3: print it (toString()) and congratulate them on their fine purchase
        System.out.println("Congratulations, your custom Television is on its way!");
        System.out.println(tv); // toString() automatically called
    }
}
