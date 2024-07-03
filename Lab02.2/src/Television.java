/*
 * Application or system class to model the workings of a television.
 * It has properties/attributes, it has business methods, but NO main() method.
 * Order your ctors from smallest to largest
 * note-setters are designed to assign values to fields
 */
class Television {
    // class-level ("static") variables-these live in a classwide common area, above the instances.
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static int instanceCount = 0;

    // properties or attributes - "fields" or "instance variables"
    private String brand = "Toshiba"; // Private field to store the brand of the television, defaulting to "Toshiba"
    private int volume = 1; // Private field to store the volume level of the television, defaulting to 1
    private boolean isMuted;
    private int oldVolume;
    private DisplayType display = DisplayType.LED;

    // constructors
    public Television() {
        instanceCount++; // Increment instance count
        // Default constructor, initializes with default values ("Toshiba" brand, volume level 1)
    }

    public Television(String brand) {
        this(); // Delegate to no-arg ctor above for instance count increment
        setBrand(brand); // Delegate to setter for any validation/conversion it might be doing
    }

    public Television(String brand, int volume) {
        this(brand); // Constructor to set both brand and volume
        setVolume(volume); // Set the volume of the television
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // functions or operations - "methods"
    public void turnOn() {
        boolean isConnected = verifyInternetConnection(); // Check internet connection status
        System.out.println("Turning on your " + getBrand() + " television and setting volume to " + getVolume());
    }

    public void turnOff() { // Corrected method name to turnOff
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted) {
            oldVolume = volume;
            volume = 0; // Set volume to 0 when muting
            isMuted = true;
            System.out.println("TV is now muted");
        } else {
            volume = oldVolume;
            isMuted = false;
            System.out.println("TV is now unmuted");
        }
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    // accessor methods - "getters, setters, toString"
    public String getBrand() {
        return brand; // Getter method to retrieve the brand of the television
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Toshiba":
            case "Sony":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand: " + brand + ". Only Samsung, LG, Toshiba, or Sony are valid brands.");
        }
    }

    public int getVolume() {
        return volume; // Getter used to retrieve the volume level of the television
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        } else {
            System.out.printf("Invalid volume: %s. Valid range is %s to %s(inclusive)."
                  volume, MIN_VOLUME, MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display; // Getter method to retrieve the display type of the television
    }

    public void setDisplay(DisplayType display) {
        this.display = display; // Setter method to set the display type of the television
    }

    public boolean isMuted() {
        return isMuted; // Getter method to check if the television is muted
    }

    public static int getInstanceCount() {
        return instanceCount; // Static getter for instance count
    }

    @Override
    public String toString() {
        return "Television: " +
                "Brand = " + getBrand() +
                ", Volume = " + getVolume() +
                ", Display = " + getDisplay(); // Override of toString to display brand and volume
    }
}
