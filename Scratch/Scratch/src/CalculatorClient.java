

class CalculatorClient {

    public static void main(String[] args) {
        // removed Calculator calc = new Calculator();

        double sum = Calculator.add(1, 3);
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1.1, 3.1));

        System.out.println("10 is even: " + Calculator.isEven(10));

        System.out.println();

        System.out.println("winner is: " + Calculator.randomInt(5, 16);  // min-max version

        System.out.println();

        System.out.println("average is: " + Calculator.average(3,4, 9, 2, 3)); // convenient
        System.out.println("average of a single number is: " + Calculator.average(3, 4, 9, 2, 3));
    }
}

