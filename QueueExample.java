import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue =
                new LinkedList<>();

        queue.add("A");
        queue.add("B");

        System.out.println(queue.poll());
    }
}
