package aps.leetcodes.newside;

public class _1791_FindCenterofStarGraph {
    public int findCenter(int[][] edges) {
        int[] result = new int[edges.length+1+1];

        for (int[] e : edges) {
            result[e[0]]++;
            result[e[1]]++;
        }

        for (int i = 1; i <= result.length; i++) {
            if (result[i] == edges.length) {
                return i;
            }
        }
        return 0;
    }
}
