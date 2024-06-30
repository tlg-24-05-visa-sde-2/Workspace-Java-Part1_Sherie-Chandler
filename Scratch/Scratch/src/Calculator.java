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
     * Returns a random integer between 1 and 11, inclusive.
     *
     * Hint: see a class called Math (in package java.lang), look for a helpful method here.
     * Note: these methods are all "static" so you don't need to create an object to use them and you can call them as such:
     * Math.methodName()
     */

    int randomInt() {
        int result = 0;

        double rand = Math.random(); // returns a double between 0.0 and 0.9999999999999999
        double scaled = (rand * 11) + 1; // scale it to be between 1 and 11.9999999999999999
        result = (int) scaled; // explicit downcast from double to int
        return result;
    }
}
