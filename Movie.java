public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;



    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        return Integer.compare(this.year, otherMovie.year);
    }
}

