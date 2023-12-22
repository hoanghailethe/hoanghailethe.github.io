package aps.leetcodes;

import java.util.HashMap;
import java.util.Map;

public class _771_JewelsAndStone {
    public static int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        Map<Character, Integer> jewelMap = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelMap.put(jewels.charAt(i), 0);
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jewelMap.containsKey(stones.charAt(i))) {
                jewelMap.put(stones.charAt(i), jewelMap.get(stones.charAt(i)) + 1);
            }
        }

        for (Map.Entry entry : jewelMap.entrySet()) {
            sum += (int) entry.getValue();
        }
        System.out.println(jewelMap);
//        int sum = 0;
//        for (int i = 0; i < jewels.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < stones.length(); j++) {
//                if (stones.charAt(j) == jewels.charAt(i)) {
//                    count++;
//                }
//            }
//            sum += count;
//
//        }
//        return sum;
        return sum;
    }
}
