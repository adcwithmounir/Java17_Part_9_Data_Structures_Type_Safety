import java.util.*;

public class ViewerActivity {
    public static void main(String[] args) {
        List<String> history = new ArrayList<>(List.of("Dune", "Up", "Dune"));
        System.out.println("History: " + history);

        Set<String> titles = new TreeSet<>(history);
        System.out.println("Titles: " + titles);

        Queue<String> upNext = new ArrayDeque<>(List.of("Arcane", "Heat"));
        System.out.println("Playing: " + upNext.poll());
        System.out.println("Up next: " + upNext);

        Map<String, Integer> plays = new TreeMap<>();
        for (String t : history) plays.merge(t, 1, Integer::sum);
        System.out.println("Plays: " + plays);
    }
}
