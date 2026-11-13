import java.util.*;

public class MovieCatalog {
    record Movie(String title, int rating) implements Comparable<Movie> {
        public int compareTo(Movie m) { return title.compareTo(m.title); }
        public String toString() { return title + " " + rating; }
    }

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Up", 9)); movies.add(new Movie("Heat", 8));
        movies.add(new Movie("Coco", 9)); movies.add(new Movie("Dune", 8));
        System.out.println("Catalog: " + movies);

        Collections.sort(movies);
        System.out.println("By title: " + movies);

        int index = Collections.binarySearch(movies, new Movie("Heat", 0));
        System.out.println("Heat is at index " + index);

        Comparator<Movie> byRating = Comparator.comparingInt(Movie::rating);
        Comparator<Movie> bestFirst = byRating.reversed().thenComparing(Movie::title);
        movies.sort(bestFirst);
        System.out.println("Best first: " + movies);
    }
}
