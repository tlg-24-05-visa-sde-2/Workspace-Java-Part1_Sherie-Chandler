public class Movie {
    // fields or instance variables
    private String title;
    private int releaseYear;
    private double revenue;

    // action methods or business--what do movies do
    // play(), pause(), rewind(), fastForward(), stop(), goTo()
    // accessor methods -provide "controlled" access to the object's (private) fields


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String toString() {
        // tell me about yourself
        return "Movie: title=" + getTitle() + ", " +
                "releaseYear=" + getReleaseYear() +
                ", revenue=" + getRevenue();
    }
}
