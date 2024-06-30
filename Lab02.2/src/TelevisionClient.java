/*
 * This is the main application class.
 * In the main() method, we will create a few television objects and give them a test drive.
 */
class TelevisionClient {
    // Entry point of the application.
    public static void main(String[] args) {
        // Create an instance of Television and set its properties.
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);

        Television tv2 = new Television();
        tv2.setBrand("Sony");
        tv2.setVolume(50);

        // Create a third Television object, but do not set its properties.
        Television tv3 = new Television();

        // Turn on and off the first television.
        tv1.turnOn();
        tv1.turnOff();

        // Turn on and off the second television.
        tv2.turnOn();
        tv2.turnOff();

        // Turn on and off the third television.
        tv3.turnOn();
        tv3.turnOff();

        // Print a blank line for separation.
        System.out.println();

        // Call the toString() method to print the details of each television.
        System.out.println(tv1.toString());
        System.out.println(tv2);
        System.out.println(tv3);
    }
}
