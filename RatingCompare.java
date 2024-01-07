import java.util.Comparator;

public class RatingCompare implements Comparator<Movie>{
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Double.compare(movie1.getRating(), movie2.getRating());
    }
}

class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getName().compareTo(movie2.getName());
    }
}
