import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        if (head.next == null){
            return true;
        }
        stack.push(head.val);
        while (head.next != null) {
            if (head.next.val == stack.peek()) {
                stack.pop();
            } else {
                stack.push(head.next.val);
            }
            head = head.next;
        }

        return stack.isEmpty();
    }
}

