/*
 * This class models the workings of a television.
 * It has properties (attributes) and business methods, but no main() method.
 */
class Television {
    // Properties or attributes, also known as "fields" or "instance variables".
    // These are the default values when values are not specified.
    private String brand;
    private int volume;

    // Methods

    // This method turns on the television and sets it to the specified volume.
    public void turnOn() {
        // Calls a private method for this task (commented out in this version).
        // boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    // This method turns off the television.
    public void turnOff() {
        System.out.println("Turning off... goodbye!");
    }

    // Accessor methods

    // This method returns the brand of the television.
    public String getBrand() {
        return brand;
    }

    // This method sets the brand of the television.
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // This method returns the volume of the television.
    public int getVolume() {
        return volume;
    }

    // This method sets the volume of the television.
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // This method returns a string representation of the television object.
    public String toString() {
        return "Television: brand=" + brand + ", volume=" + volume;
    }

    // Private method to verify internet connection (commented out in this version).
    // private boolean verifyInternetConnection() {
    //    return true; // fake implementation
    // }
}
