package day10;

import java.util.ArrayList;
import java.util.List;

public class _1260_Shift2DGrid {
    /**
     * 4 ms
     * 
     * 39.6 MB
     * 
     * 86.61%
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr = new int[n * m];
        int h = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arr[h] = grid[i][j];
                h++;
            }
        }
        k = k % arr.length;
        revese(arr, 0, arr.length - 1);
        revese(arr, 0, k - 1);
        revese(arr, k, arr.length - 1);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>(m);
        for (int i = 0; i < arr.length; i++) {
            if (list.size() == m) {
                res.add(list);
                list = new ArrayList<>();
            }
            list.add(arr[i]);
        }
        res.add(list);
        return res;
    }

    private void revese(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
