import java.util.*;

public class ContentShelf {
    interface Watchable { int minutes(); }
    record Movie(String title, int minutes) implements Watchable { }
    record Episode(String title, int minutes) implements Watchable { }

    static class Shelf<T> {
        private final List<T> items = new ArrayList<>();
        void put(T item) { items.add(item); }
        List<T> items() { return items; }
    }

    public static void main(String[] args) {
        Shelf<Movie> movies = new Shelf<>();
        movies.put(new Movie("Dune", 155));
        movies.put(new Movie("Heat", 170));
        Movie first = movies.items().get(0);
        System.out.println("First movie: " + first.title());
        System.out.println("Movie minutes: " + total(movies.items()));

        Shelf<Watchable> mix = new Shelf<>();
        mix.put(new Episode("Pilot", 50));
        addPick(mix.items());
        System.out.println("Mix: " + mix.items());
        System.out.println("Mix minutes: " + total(mix.items()));
    }

    static int total(List<? extends Watchable> list) {
        int sum = 0;
        for (Watchable w : list) sum += w.minutes();
        return sum;
    }

    static void addPick(List<? super Movie> list) {
        list.add(new Movie("Up", 96));
    }
}
