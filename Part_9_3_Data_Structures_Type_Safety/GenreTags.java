import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GenreTags {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();
        tags.add("Drama");
        tags.add("Sci-Fi");
        tags.add("Comedy");
        System.out.println(tags);

        boolean added = tags.add("Drama");
        System.out.println(added + " " + tags.size());

        tags.removeIf(t -> t.startsWith("S"));
        System.out.println(tags.contains("Sci-Fi") + " " + tags);

        Set<String> sorted = new TreeSet<>(tags);
        Set<String> frozen = Set.copyOf(sorted);
        tags.add("Horror");
        System.out.println(sorted + " " + frozen.contains("Horror"));
    }
}
