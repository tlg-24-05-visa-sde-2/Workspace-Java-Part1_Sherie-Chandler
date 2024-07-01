/*
 * This is the main application class.
 * In the main() method, we will create a few television objects and give them a test drive.
 */
class TelevisionClient {
    // Entry point of the application.
    public static void main(String[] args) {
        // Create an instance of Television and set its properties.
        Television tv1 = new Television();
        tv1.setBrand("Samsung"); //HW updated to use setter-right click generate did not work
        tv1.setVolume(32);  //HW updated to use setter-right

        //create a second instance of Television and set its properties also.
        Television tv2 = new Television();
        tv2.setBrand("Sony");
        tv2.setVolume(50);

        // Create a third Television object, but do not set its properties.
        Television tv3 = new Television();

        // Turn them all on
        tv1.turnOn();
        tv1.turnOff();
        tv3.turnOn();

        // Turn them all off
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOff();

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
