package aps.leetcodes.newside;

import java.util.HashMap;
import java.util.Map;

public class _997_FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] result = new int[trust.length+2];
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int[] e : trust) {
            result[e[0]]++;
            result[e[1]]++;
            tempMap.put(e[0], e[1]);
        }

        for (int i = 1; i < result.length ; i++) {
            if (result[i] == N-1 && !tempMap.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
}
