public class Movie {
    // fields or instance variables at the top
    private String title;
    private int releaseYear;
    private double revenue;

    // constructors--these get called when the client says new.
    public Movie(){
        // no-op
    }

    public Movie(String title){
setTitle(title);
    }

    public Movie(String title, int releaseYear, double revenue){
        // delegate to setters for any data validation/conversion they might be doing
        this(title); // delegate to ctor above me for title
        setReleaseYear(releaseYear); // delegate to setters for the rest of them
        setRevenue(revenue); // by delegating to their respective setters

    }

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
