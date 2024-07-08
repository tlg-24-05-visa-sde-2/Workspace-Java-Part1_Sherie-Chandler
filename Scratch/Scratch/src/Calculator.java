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
* Return the average of the supplied integers.
* average()*/

    public static double average(int first, int...rest) { // 3, 4, 9, 2, 3
        // inside here, values is automatically an array of int[]
        double sum = first;

        for (int value : rest) {
            sum = sum + value;
        }
 return  sum / (rest.length + 1);
        }



    /*
     * Returns a random integer between 1 and 11 (inclusive).
     * Uses Math.random() to generate a random double between 0.0 (inclusive) and 1.0 (exclusive),
     * scales it to the range [1, 11], and then casts it to an integer.
     */
    public static int randomInt(int min, int max) {
        int result = 0;

        double rand = Math.random(); // 0.000 to 0.9999
        double scaled = (rand * (max - min + 1)); // 0.0000 to 11.999
        double lifted = scaled + min; // 5.00 to 16.999
        result = (int) lifted;
        return result;
    }

    /*
     * Returns a random integer between min and max (inclusive).
     * Uses Math.random() to generate a random double between 0.0 (inclusive) and 1.0 (exclusive),
     * scales it to the range [min, max], and then casts it to an integer.
     */
    public static int randomInt(){ return randomInt(1, 11); }
       // int result = 0;
        // double rand = Math.random();
       // double scaled = (rand * (max - min + 1));
       // double lifted = scaled + min;
      //  result = (int) lifted;
       // return result;

    }
}
