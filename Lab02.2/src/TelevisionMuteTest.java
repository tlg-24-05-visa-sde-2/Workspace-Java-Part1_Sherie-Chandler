public class TelevisionMuteTest {

    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);
        System.out.println(tv);
        System.out.println();

        // Test valid brands
        testValidBrand(tv, "Samsung", "Samsung");
        testValidBrand(tv, "LG", "LG");
        testValidBrand(tv, "Sony", "Toshiba");
        testValidBrand(tv, "Toshiba", "Toshiba");

        // Test invalid brand
        testInvalidBrand(tv, "Invalid");
    }


    private static void testValidBrand(Television tv, String brand, String validBrand) {
        tv.setBrand("Samsung");
        System.out.println(tv);

        tv.setBrand("LG");
        System.out.println(tv);

        tv.setBrand("Sony");
        System.out.println(tv);

        tv.setBrand("Toshiba");
        System.out.println(tv);

        tv.setBrand("Invalid");
        System.out.println(tv);

        System.out.println("Expected Brand: " + validBrand);
        System.out.println();
    }


    private static void testInvalidBrand(Television tv, String invalidBrand) {
        System.out.println("Testing invalid brand:");
        tv.setBrand(invalidBrand);
        System.out.println(tv);
        System.out.println();

        tv.setVolume(100);
        System.out.println(tv);
        System.out.println();

        tv.setVolume(-1);
        System.out.println(tv);
        System.out.println();

        tv.setVolume(101);
        System.out.println(tv);
        System.out.println();

        tv.mute();
        System.out.println(tv);



    }
}
