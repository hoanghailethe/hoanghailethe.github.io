import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.deque;

public class _1260_2dGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int a = grid.length;
        int b = grid[0].length;
        Deque<Integer> deque = new ArrayDeque<>(); 
        List<List<Integer>> lists = new LinkedList<>();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                deque.addLast(grid[i][j]);
            }
        }

        for (int i = 0; i < k; i++) {
            int tempt = deque.removeLast();
            deque.addFirst(tempt);
        }

        for (int i = 0; i < a ; i++) {
            List<Integer> list = new LinkedList<>();
            for (int j = 0; j < b; j++) {
                list.add(deque.removeFirst());
                }
            lists.add(list);
        }

        return lists;
    }
}
