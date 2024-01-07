import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();


        Collections.sort(movies);


        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(movies, ratingCompare);


        NameCompare nameCompare = new NameCompare();
        Collections.sort(movies, nameCompare);
    }
}