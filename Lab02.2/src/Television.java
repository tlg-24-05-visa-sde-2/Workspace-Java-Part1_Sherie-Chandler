/*
 * This class models the workings of a television.
 * It has properties (attributes) and business methods, but no main() method.
 */
public class Television {
    // Properties or attributes, also known as "fields" or "instance variables".
    // These are the default values when values are not specified.

    private String brand; // Encapsulated the data to make it private
    private int volume; // Encapsulated the data to make it private
    private boolean isOn;  // Added encapsulated boolean property for on/off state

    // Constructor
    public Television() {
        // Default constructor
    }

    // Business Methods

    // This method turns on the television and sets it to the specified volume.
    public void turnOn() {
        this.isOn = true; // Updated to turn on the television
        boolean isConnected = verifyInternetConnection(); // Call to private method
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    // This method turns off the television.
    public void turnOff() {
        this.isOn = false;  // Updated to turn off the television
        System.out.println("Turning off... goodbye!");
    }

    // Private method to verify internet connection
    private boolean verifyInternetConnection() {
        return true; // Fake implementation, could check actual connection status
    }

    // Accessor methods: getters, setters, toString

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

    // This method returns whether the television is on.
    public boolean isOn() {
        return isOn;
    }

    // This method sets the on state of the television.
    public void setOn(boolean on) {
        isOn = on;
    }

    // This method returns a string representation of the television object.
    @Override
    public String toString() {
        return "Television: brand=" + brand + ", volume=" + volume + ", isOn=" + isOn;
    }
}
