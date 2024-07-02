/*This is an "all static" class, i.e. it has nothing but static methods.
*
* */

class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

   public static double subtract(double a, double b) {
        return a - b;
    }

   public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive).
     * Uses Math.random() to generate a random double between 0.0 (inclusive) and 1.0 (exclusive),
     * scales it to the range [1, 11], and then casts it to an integer.
     */
    public static int randomInt() {
        double rand = Math.random(); // Generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double scaled = (rand * 11) + 1; // Scales to the range [1, 11]
        int result = (int) scaled; // Casts the scaled double to an integer
        return result;
    }
}
