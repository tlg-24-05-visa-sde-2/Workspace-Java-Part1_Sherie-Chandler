public static void main(String[] args) {

    // setVolume() testing (in range + out of range)
    Television tv = new Television();
    //should stick, values 0 & 100

    tv.setVolume(0); // should stick
    System.out.println("volume:"+ tv.getVolume()); // should be 0


    tv.setVolume(100); // should stick
    System.out.println("volume:"+ tv.getVolume()); // should be 100

    //error messages, should still have volume 100 from before
    tv.setVolume(-1);
    tv.setVolume(101);
    System.out.println("volume:"+ tv.getVolume()); // should still be 100, from before
    System.out.println();



    // ***************************************************************
    // setBrand() testing (all 4 + invalid brand)
    tv.setBrand("Samsung"); // should stick
    System.out.println("brand:"+ tv.getBrand()); // should be Samsung

    tv.setBrand("LG"); // should stick
    System.out.println("brand:"+ tv.getBrand()); // should be LG

    tv.setBrand("Sony"); // should stick
    System.out.println("brand:"+ tv.getBrand()); // should be Sony

    tv.setBrand("Toshiba"); // should stick
    System.out.println("brand:"+ tv.getBrand()); // should be Toshiba

    // invalid brand, should show error
    tv.setBrand("InvalidBrand"); // error message, brand not set
    System.out.println("brand:"+ tv.getBrand());
    System.out.println();

    // ***************************************************************
    // muted testing
    Television tv2 = new Television("Samsung", 32);
    System.out.println(tv2);
    tv2
