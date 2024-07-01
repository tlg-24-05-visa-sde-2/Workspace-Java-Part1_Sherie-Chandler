/*
* Client main-class for test-driving a few instances of Guitar.
*/

class GuitarClient {
    public static void main(String[] args) {
        // create a Guitar object and set its properties
        Guitar g1 = new Guitar();
        g1.setBrand("Fender");
        g1.type = "electric";

        // then call methods on it
        g1.changeStrings();
        g1.tune();
        g1.play("Owner of a Lonely Heart");

        System.out.println(); //blank line, for better readability in the output

        // create another instance, and do the same things

        Guitar g2 = new Guitar();
        g2.setBrand("Gibson");
        g2.type = "acoustic";
        g2.strings = 12;

        g2.changeStrings();
        g2.tune();
        g2.play("Stairway to Heaven");

    }
}

