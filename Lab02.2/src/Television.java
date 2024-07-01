/*
 * This class models the workings of a television.
 * It has properties (attributes) and business methods, but no main() method.
 */
public class Television {
    // Properties or attributes, also known as "fields" or "instance variables".
    // These are the default values when values are not specified.

    private String brand; // HW encapsulated the data to make it private-now the data is only available inside
    private int volume; // HW encapsulated the data to make it private
    private boolean isOn;  // HW Added isOn ---encapsulated boolean property

    // Constructor
    public Television() {
        // Default constructor
    }

    // Business Methods

    // This method turns on the television and sets it to the specified volume.
    public void turnOn() {
        this.isOn = true;  // HW Update isOn property
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    // This method turns off the television.
    public void turnOff() {
        this.isOn = false;  // HW Update isOn property
        System.out.println("Turning off... goodbye!");
    }

    // Accessor methods

    // This method returns the brand of the television.
    public String getBrand() {
        return brand;
    }

    // This method sets the brand of the television bc the parameter is named the same as the field.
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
        return isOn;  // HW Added getter for isOn
    }

    // This method sets the on state of the television.
    public void setOn(boolean on) {
        isOn = on;  // HW Added setter for isOn
    }

    // This method returns a string representation of the television object.
    public String toString() {
        return "Television: brand=" + brand + ", volume=" + volume + ", isOn=" + isOn;  // Updated toString
    }
}
