/* A constructor (delegate to setters) is a special method called when creating instances, used to initialize the new object
* they always have the same name as their class and every class must have at least 1 ctor, they do not have an
* explicit return type---abbreviated "ctor"
* */

class MovieClient {

    // shortcut type main and enter

    public static void main(String[] args) {
        // reinforce the default value added as an example-the title will return null.
        Movie movie1 = new Movie();
        System.out.println(movie1);

Movie movie2 = new Movie();
movie2.setTitle("Dune"); // method calls that can pass args.
movie2.setReleaseYear(2021);
movie2.setRevenue(433_000_000.0);
System.out.println(movie2); // toString() automatically called
        System.out.println();

        Movie movie3 = new Movie("Finding Nemo", 2003, 940_000_000.0); // new indicates a "ctor" we will fix it soon--fixed1500.
        System.out.println(movie3);
        System.out.println();

        Movie movie4 = new Movie("Adventures of Jay and Deshon");
        System.out.println(movie4);
        System.out.println();
    }
}
