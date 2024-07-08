package net.flix;

public class Movie {
    // fields or instance variables
    private String title;
    private int releaseYear;
    private double revenue;
    private Rating rating;
    private Genre genre;

    // constructors - these get called when the client says "new"
    public Movie() {
        // no-op
    }

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, int releaseYear, double revenue, Rating rating, Genre genre) {
        this(title);                  // delegate to ctor above me for title
        setReleaseYear(releaseYear);  // handle the rest of them myself,
        setRevenue(revenue);          // by delegating to their respective setters
        setRating(rating);
        setGenre(genre);              // add this to assign the genre
    }

    public Movie(String title, Genre genre) {
        setTitle(title);
        setGenre(genre);
    }

    // business or "action" methods
    // play(), pause(), rewind(), fastForward(), stop(), goTo()

    // accessor methods - provide "controlled" access to the object's (private) fields
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

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return String.format("Movie: title=%s, releaseYear=%d, revenue=%,.2f, rating=%s, genre=%s", getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    }
}

// return "Movie: title=" + getTitle() + ", releaseYear=" + getReleaseYear() + ", revenue=" + getRevenue() + ", rating=" + getRating() + ", genre=" + getGenre();
