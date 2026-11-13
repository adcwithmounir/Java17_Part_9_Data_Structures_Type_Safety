import java.util.Map;
import java.util.TreeMap;

public class WatchTime {
    public static void main(String[] args) {
        Map<String, Integer> watchTime = new TreeMap<>();
        watchTime.merge("Dune", 45, Integer::sum);
        watchTime.merge("Up", 30, Integer::sum);
        System.out.println(watchTime);

        watchTime.merge("Dune", 60, Integer::sum);
        watchTime.putIfAbsent("Arcane", 0);
        watchTime.putIfAbsent("Up", 0);
        System.out.println(watchTime);

        System.out.println("Heat: " + watchTime.getOrDefault("Heat", 0));
        System.out.println("Dune: " + watchTime.get("Dune"));

        watchTime.forEach((show, min) ->
            System.out.println(show + ": " + min + " min"));
    }
}
