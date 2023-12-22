package aps.leetcodes.newside;

import java.util.*;
import java.util.stream.Collectors;

public class BaiTapOnTap {
    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int temp = 0;

        while (aIndex >= 0 || bIndex >= 0 || temp == 1) {
            temp += aIndex >= 0 ? a.charAt(aIndex) - '0' : 0;
            temp += bIndex >= 0 ? b.charAt(bIndex) - '0' : 0;

            result.insert(0, (char) (temp % 2 + '0'));

            temp /= 2;
            aIndex--;
            bIndex--;
        }

        return result.toString();
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> numOfChar = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (numOfChar.containsKey(s.charAt(i))) {
                numOfChar.put(s.charAt(i), numOfChar.get(s.charAt(i)) + 1);
            } else {
                numOfChar.put(s.charAt(i), 1);
            }
        }

        int max = 0;
        boolean hasOddValue = false;
        for (Map.Entry entry : numOfChar.entrySet()) {
            if ((int) entry.getValue() % 2 == 0) {
                max += (int) entry.getValue();
            } else {
                max += (int) entry.getValue() - 1;
                hasOddValue = true;
            }
        }

        return !hasOddValue ? max : max + 1;

    }

    public static boolean wordPattern(String pattern, String s) {
        String[] stringArr = s.split(" ");
        if (pattern.length() != stringArr.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(stringArr[i])) {
                    return false;
                }
            } else if (map.containsValue(stringArr[i])) {
                return false;
            }
            map.put(pattern.charAt(i), stringArr[i]);
        }
        return true;
    }

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        int temp = s.length() - 1;
        while (temp >= 0) {

            if (!stack.isEmpty() && Math.abs(s.charAt(temp) - stack.peek()) == 32) {
                stack.pop();
            } else {
                stack.push(s.charAt(temp));
            }
            temp--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> stringBuilder.append(entry.getValue()));

        return stringBuilder.toString();
    }

    static int sumOfArea = 0;
    static int maxArea = 0;

    public static int maxAreaOfIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sumOfArea++;
                    grid[i][j] = 0;
                    findPath(grid, i, j);
                    if (maxArea <= sumOfArea) {
                        maxArea = sumOfArea;
                    }
                    sumOfArea = 0;
                }
            }
        }
        return maxArea;
    }

    public static void findPath(int[][] grid, int i, int j) {
        int[] xDir = {0, 0, 1, -1};
        int[] yDir = {1, -1, 0, 0};
        int N = grid.length;
        int M = grid[0].length;

        for (int dir = 0; dir < 4; dir++) {
            int nextX = i + xDir[dir];
            int nextY = j + yDir[dir];

            if (nextX >= 0 && nextX < N
                    && nextY >= 0 && nextY < M
                    && grid[nextX][nextY] == 1) {
                sumOfArea++;
                grid[nextX][nextY] = 0;
                findPath(grid, nextX, nextY);
            }
        }
    }

    public static void main(String[] args) {

//        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
//        int[][] matrix2 = {{1, 2}, {2, 2}};
        //String s = "bb";
        //String pattern = "abba", s = "dog cat cat fish";
//        String s = "lEeeetcode";
//        System.out.println(makeGood(s));
//        String s = "codeleet";
//        int[] indices = {4,5,6,7,0,2,1,3};
//        System.out.println(restoreString(s, indices));
        //System.out.println(wordPattern(pattern, s));
        //System.out.println(longestPalindrome(s));
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        System.out.println(maxAreaOfIsland(grid));
    }
}
