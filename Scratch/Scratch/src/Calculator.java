class Calculator {
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between min and max (inclusive).
     * Uses Math.random() to generate a random double between 0.0 (inclusive) and 1.0 (exclusive),
     * scales it to the desired range, and then casts it to an integer.
     */
    int randomInt(int min, int max) {
        double rand = Math.random();   // Generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double scaled = (rand * (max - min + 1)) + min; // Scales to the range [min, max]
        int result = (int) scaled; // Casts the scaled double to an integer
        return result;
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive).
     * Uses Math.random() to generate a random double between 0.0 (inclusive) and 1.0 (exclusive),
     * scales it to the range [1, 11], and then casts it to an integer.
     */
    int randomInt() {
        double rand = Math.random(); // Generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double scaled = (rand * 11) + 1; // Scales to the range [1, 11]
        int result = (int) scaled; // Casts the scaled double to an integer
        return result;
    }
}
