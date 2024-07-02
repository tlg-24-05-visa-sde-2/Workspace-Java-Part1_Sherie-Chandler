class CalculatorClient {

    public static void main(String[] args) {
        // removed Calculator calc = new Calculator();

        double sum = calc.add(1.0, 3.0); // Corrected method name to lowercase 'add' and passed doubles explicitly
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1.1, 3.1)); // passed doubles as expected

        System.out.println("10 is even: " + Calculator.isEven(10));

        System.out.println();

        System.out.println("And the winner is: " + Calculator.randomInt(10));  // calls the 1 to max whatever that means.

        // Uncommented line to print random integer between 5 and 16
        // System.out.println("Random number between 5 and 16: " + calc.randomInt(5, 16));
    }
}
