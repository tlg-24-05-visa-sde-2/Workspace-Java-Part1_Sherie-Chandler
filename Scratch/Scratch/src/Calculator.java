/* This is an "all static" class, i.e. it has nothing but static methods. */
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
        int result = (int) (rand * 11) + 1; // Scales to the range [1, 11] and casts to an integer
        return result;
    }

    /*
     * Returns a random integer between min and max (inclusive).
     * Uses Math.random() to generate a random double between 0.0 (inclusive) and 1.0 (exclusive),
     * scales it to the range [min, max], and then casts it to an integer.
     */
    public static int randomInt(int min, int max) {
        double rand = Math.random(); // Generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        int result = (int) (rand * (max - min + 1)) + min; // Scales to the range [min, max] and casts to an integer
        return result;
    }
}
