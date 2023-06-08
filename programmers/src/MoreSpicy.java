
import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int count = 0;
        boolean check = false;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int num : scoville) {
            priorityQueue.add(num);
        }
        while (priorityQueue.size() > 0) {
            if (priorityQueue.peek() >= K) {
                check = true;
                break;
            } else if (priorityQueue.size() == 1) {
                break;
            }
            int first = priorityQueue.poll();
            if (priorityQueue.peek() != null) {
                int second = priorityQueue.poll();
                priorityQueue.add(first + (second * 2));
            }
            count++;
        }
        if (check) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }

    }
}
