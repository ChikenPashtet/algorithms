import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    int top;

    public Solution() {

    }

    public void push(int x) {
        queue2.add(x);
        top = x;
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        int ret = 0;
        if (!queue1.isEmpty()) {
            ret = queue1.remove();
        }
        if (!queue1.isEmpty()) {
            top = queue1.peek();
        }
        return ret;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
