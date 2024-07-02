class CalculatorClient {

    public static void main(String[] args) {
        // removed Calculator calc = new Calculator();

        double sum = Calculator.add(1.0, 3.0);
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1.1, 3.1));

        System.out.println("10 is even: " + Calculator.isEven(10));

        System.out.println();

        System.out.println("And the winner is: " + Calculator.randomInt(5, 16));  // calls the new randomInt method with parameters

        // Uncommented line to print random integer between 5 and 16
        // System.out.println("Random number between 5 and 16: " + Calculator.randomInt(5, 16));
    }
}
