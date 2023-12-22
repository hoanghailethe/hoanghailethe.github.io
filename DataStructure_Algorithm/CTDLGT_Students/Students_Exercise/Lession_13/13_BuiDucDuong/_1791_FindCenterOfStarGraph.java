import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1791_FindCenterOfStarGraph {
    public static void main(String[] args) {

    }

    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            map.put(edges[i][0], map.getOrDefault(edges[i][0], 0) + 1);
            map.put(edges[i][1], map.getOrDefault(edges[i][1], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() == edges.length) {
                return set.getKey();
            }
        }
        return 0;
    }

    public int findCenter2(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < edges.length; i++) {
            if (set.contains(edges[i][0])) {
                return edges[i][0];
            }
            if (set.contains(edges[i][1])) {
                return edges[i][1];
            }
            set.add(edges[i][0]);
            set.add(edges[i][1]);
        }
        return 0;
    }

    public int findCenter3(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
