public class CalculatorTest {

    public static void main(String[] args) {
        // we will call randomInt() 100_000_000 times and check the result each time for the range 5 to 16
        // if it is < 5 or > 16, we know it is not right, escape the loop and show the result.
        boolean isCorrect = true;
        int min = 5;
        int max = 16;

        for (int i = 0; i < 100_000_000; i++) {
            int random = Calculator.randomInt(min, max); // min: 5, max: 16

            if (random < min || random > max) { // Houston, we have a problem like a bug or defect.
                isCorrect = false;
                // there is no reason to keep calling/checking, so break the loop.
                break;
            }
        }

        // print your report outside of the for loop
        if (isCorrect) {
            System.out.println("It Works!");
        } else {
            System.out.println("There is a problem with the randomInt method.");
        }
    }
}
