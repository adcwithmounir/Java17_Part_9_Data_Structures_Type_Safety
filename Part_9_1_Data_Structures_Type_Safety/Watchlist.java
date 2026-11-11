import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Watchlist {
    public static void main(String[] args) {
        Collection<String> watchlist = new ArrayList<>();
        System.out.println(watchlist.add("Dune"));
        watchlist.add("Up");
        watchlist.add("Dune");
        watchlist.add("");
        System.out.println(watchlist + " size " + watchlist.size());

        System.out.println(watchlist.remove("Dune"));
        System.out.println(watchlist.remove("Matrix"));
        watchlist.removeIf(t -> t.length() < 3);
        System.out.println(watchlist.contains("Dune") + " " + watchlist.contains("dune"));
        watchlist.forEach(System.out::println);

        Collection<String> genres = new HashSet<>();
        System.out.println(genres.add("Drama"));
        System.out.println(genres.add("Drama"));
        System.out.println(genres.size());

        watchlist.clear();
        System.out.println(watchlist.isEmpty() + " size " + watchlist.size());
    }
}
