import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (set.contains(board[i][j]) & board[i][j] != '.') {
                    System.out.println("First");
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (set.contains(board[j][i]) & board[j][i] != '.') {
                    return false;
                } else {
                    set.add(board[j][i]);
                }
            }
        }
        if (!(checkCub(0, 3, board) &
                checkCub(3, 6, board) &
                checkCub(6, 9, board))) {
            return false;
        }
        return true;
    }

    public static boolean checkCub(int start, int end, char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            for (int j = 0; j < 3; j++) {
                if (set.contains(board[i][j]) & board[i][j] != '.') {
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }
        set.clear();
        for (int i = start; i < end; i++) {
            for (int j = 3; j < 6; j++) {
                if (set.contains(board[i][j]) & board[i][j] != '.') {
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }
        set.clear();
        for (int i = start; i < end; i++) {
            for (int j = 6; j < 9; j++) {
                if (set.contains(board[i][j]) & board[i][j] != '.') {
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
