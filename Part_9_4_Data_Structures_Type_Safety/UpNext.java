import java.util.ArrayDeque;
import java.util.Deque;

public class UpNext {
    public static void main(String[] args) {
        Deque<String> upNext = new ArrayDeque<>();
        upNext.offer("Episode 1");
        upNext.offer("Episode 2");
        upNext.offerFirst("Trailer");
        System.out.println(upNext);

        System.out.println("Playing " + upNext.poll());
        System.out.println("Next: " + upNext.peek());

        Deque<String> history = new ArrayDeque<>();
        history.push(upNext.poll());
        history.push(upNext.poll());
        System.out.println(history + " " + upNext);

        System.out.println("Back to " + history.pop() + ", then " + history.peek());
        System.out.println(upNext.poll() + " " + upNext.peek());
    }
}
