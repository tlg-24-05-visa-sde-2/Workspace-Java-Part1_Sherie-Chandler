/*
 * Application main-class.
 * In the main() method, we will create a few Television objects and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances have been created");

        // Create instances of Television and set their properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung"); // Set brand of tv1
        tv1.setVolume(Television.MAX_VOLUME);// crank it up
        tv1.setDisplay(DisplayType.PLASMA);

        Television tv2 = new Television("Sony", Television.MIN_VOLUME, DisplayType.OLED); // keep quiet

        Television tv3 = new Television("LG"); // Create tv3 with brand

        // Test tv1
        tv1.turnOn(); // Turn on tv1
        tv1.turnOff(); // Turn off tv1
        System.out.println(tv1); // Print details of tv1
        System.out.println();

        // Test tv2
        tv2.turnOn(); // Turn on tv2
        tv2.turnOff(); // Turn off tv2
        System.out.println(tv2);
        System.out.println();

        // Test tv3
        tv3.turnOn(); // Turn on tv3
        tv3.turnOff(); // Turn off tv3
        System.out.println(tv3); //
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances have been created");

    }
}
