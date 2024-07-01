/*
 * Application or system class to model the workings of a television.
 * It has properties/attributes, it has business methods, but NO main() method.
 * Order your ctors from smallest to largest
 * note-setters are designed to assign values to fields
 */
class Television {
    // properties or attributes - "fields" or "instance variables"
    private String brand = "Toshiba"; // Private field to store the brand of the television, defaulting to "Toshiba"
    private int volume = 1; // Private field to store the volume level of the television, defaulting to 1

    // constructors
    public Television() {
        // Default constructor, initializes with default values ("Toshiba" brand, volume level 1)
    }

    public Television(String brand) {
        setBrand(brand); // Constructor to set the brand of the television
    }

    public Television(String brand, int volume) {
        this(brand); // Constructor to set both brand and volume
        setVolume(volume); // Set the volume of the television
    }

    // functions or operations - "methods"
    public void turnOn() {
        boolean isConnected = verifyInternetConnection(); // Check internet connection status (unused in current code)
        System.out.println("Turning on your " + getBrand() + " television and setting volume to " + getVolume());
    }

    public void turnoff () {
        System.out.println("Shutting down...goodbye");
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    // accessor methods - "getters, setters, toString"
    public String getBrand() {
        return brand; // Getter method to retrieve the brand of the television
    }

    public void setBrand(String brand) {
        this.brand = brand; // Setter used to set the brand of the television
    }

    public int getVolume() {
        return volume; // Getter used to retrieve the volume level of the television
    }

    public void setVolume(int volume) {
        this.volume = volume; // Setter used to set the volume
    }

    public String toString() {
        return "Television: " +
                "Brand = " + getBrand() +
                ", Volume = " + getVolume(); // Override of toString
    }

}
