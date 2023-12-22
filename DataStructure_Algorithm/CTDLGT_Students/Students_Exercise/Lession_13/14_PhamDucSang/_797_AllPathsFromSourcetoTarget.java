package aps.leetcodes.newside;

import java.util.ArrayList;
import java.util.List;

public class _797_AllPathsFromSourcetoTarget {
    List<List<Integer>> result = new ArrayList<>();

    void DFS(int u, int target, int[][] graph, List<Integer> path) {
        // find path
        if (u == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        // duyet cac dinh
        for (int v : graph[u]) {
            path.add(v);
            DFS(v, target, graph, path);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int target = graph.length - 1;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        DFS(0, target, graph, path);
        return result;
    }
}
