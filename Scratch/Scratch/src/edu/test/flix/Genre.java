package edu.test.flix;

enum Genre {
    ANIME("Anime"),  // each of these are calling the Genre() ctor below
    DRAMA("Drama"),
    HORROR("Horror!!"),
    ROMANTIC_COMEDY("Romantic Comedy"),
    DOCUMENTARY("Documentary"),
    MYSTERY("Mystery"),
    SCI_FI("Sci-Fi"),
    INTERNATIONAL("International"); // Removed the extra comma

    // everything under here is just regular class definition stuff, i.e., fields, ctors, methods
    private String display;

    // implicitly private, no "new" from outside
    Genre(String display) {
        System.out.println("Genre ctor called");
        this.display = display; // getter no setter---genres are immutable
    }

    // the constructor must be private, explicitly private-no "new" from outside

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return display;
    }
}


// practice this in your enum