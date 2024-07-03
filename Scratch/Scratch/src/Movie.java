class Movie {
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

    public Movie(String title, int releaseYear, double revenue) {
        this(title);                  // delegate to ctor above me for title
        setReleaseYear(releaseYear);  // handle the rest of them myself,
        setRevenue(revenue);          // by delegating to their respective setters
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

    public String toString() {
        // TODO July 3rd--slide 167: make it right, so that a null revenue shows up as null,
        // and a non-null revenue shows up as 123,000, 345.94
        // Hint: if revenue is null, use %s, otherwise use %,.2F
    }
        return String.format("Movue: title=%, releaseYear=%s, revenue=%s, rating=%s, genre=%s", getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

        return "Movie: title=" + getTitle() + ", releaseYear=" + getReleaseYear() + " revenue=+" + getRevenue() + ", rating=" + getRating() + ", genre=" + getGenre();