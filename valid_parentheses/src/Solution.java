import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("(()()())"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stack.push(arr[i]);
            }
            if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                if (stack.empty()) {
                    return false;
                }
                if (reverse(stack.peek()) != arr[i]) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static char reverse(char c) {
        if (c == '{') {
            return '}';
        }
        if (c == '[') {
            return ']';
        }
        if (c == '(') {
            return ')';
        }
        return '!';
    }
}