/*
 * Business class for WhiteboardModel code review assignment.
 *
 */


class Guitar {
    // properties or attributes, we call them "instance variables" or "fields" in Java
    String brand;
    String type; //constraint: ["accoustic", "electric", "classical"]
    int strings = 6; // (default 6)

    // functions ("methods" in Java) - what do Guitar objects do?
    void changeStrings() {
        System.out.println("Changing all " + strings + " strings");
    }

    void tune() {
        System.out.println("Tuning your " + brand + " " + strings + "-string " + type + " guitar");
    }
    public void play(String song) {
        System.out.println("Playing" + song + "")
    }

    // accessor methods - provide "controlled access" to the object's fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
