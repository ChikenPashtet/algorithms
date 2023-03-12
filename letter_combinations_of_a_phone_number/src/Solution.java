import java.util.*;

public class Solution {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> queue = new LinkedList<>();
        String[] array = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits.isEmpty()) return queue;
        queue.add("");
        for (int i = 0; i < digits.length(); i++) {
            int digit_button = Character.getNumericValue(digits.charAt(i));
            while (queue.peek().length() == i) {
                String last = queue.remove();
                for (char c : array[digit_button].toCharArray()) {
                    queue.add(last + c);
                }
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        List<String> list = letterCombinations("23");
        for (String i : list) {
            System.out.print(i + "; ");
        }
    }

}
