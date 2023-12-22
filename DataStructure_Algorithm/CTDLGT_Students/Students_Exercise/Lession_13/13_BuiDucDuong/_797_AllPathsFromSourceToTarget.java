import java.util.ArrayList;
import java.util.List;

public class _797_AllPathsFromSourceToTarget {
    public static void main(String[] args) {
        int[][] graph = { { 4, 3, 1 }, { 3, 2, 4 }, { 3 }, { 4 }, {} };
        allPathsSourceTarget(graph);
    }

    // Lời giải 1: 
    /**
     * 8 ms
     * 
     * 52.3 MB
     * 
     * 9.13%
     */
    static List<List<Integer>> res;

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res = new ArrayList<>();
        DFS(graph, 0, new ArrayList<>());
        return res;
    }

    private static void DFS(int[][] graph, int i, List<Integer> prevList) {
        List<Integer> list = new ArrayList<>(prevList);
        list.add(i);
        if (i == graph.length - 1) {
            res.add(list);
            return;
        }

        for (int j = 0; j < graph[i].length; j++) {
            DFS(graph, graph[i][j], list);
        }
    }

}
