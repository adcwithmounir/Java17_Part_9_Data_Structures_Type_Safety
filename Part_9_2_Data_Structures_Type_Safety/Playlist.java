import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public static void main(String[] args) {
        List<String> playlist = new ArrayList<>();
        playlist.add("Pilot");
        playlist.add("Finale");
        System.out.println(playlist);

        playlist.add(1, "The Twist");
        System.out.println(playlist.set(2, "Season End"));
        System.out.println(playlist);

        playlist.remove(0);
        playlist.replaceAll(String::toUpperCase);
        System.out.println(playlist);

        String[] episodes = playlist.toArray(new String[0]);
        List<String> frozen = List.copyOf(playlist);
        playlist.clear();
        System.out.println(episodes.length + " " + frozen);
    }
}
