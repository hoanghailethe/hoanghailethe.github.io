public class _888_fairCandySwap {

//     Runtime: 1072 ms, faster than 5.69% of Java online submissions for Fair Candy Swap.
// Memory Usage: 63.1 MB, less than 45.20% of Java online submissions for Fair Candy Swap.
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int candyAlice = sumCandy(aliceSizes);
        int candyBob = sumCandy(bobSizes);
        
        int changeToEqual = (candyAlice + candyBob) / 2 - candyAlice;
        int[] ans = new int[2];
        
        for (int ACandy : aliceSizes) {
            for (int BCandy : bobSizes) {
                if (BCandy - ACandy == changeToEqual) {
                    ans[0] = ACandy;
                    ans[1] = BCandy; 
                }
            }
        }
        return ans;
        
    }
    
    public int sumCandy(int[] box) {
        int sumCandy = 0;
        for (int candy : box) {
            sumCandy += candy;
        }
        return sumCandy;
    }
}

//Fastest
class Solution2 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = Arrays.stream(aliceSizes).sum();
        int sumB = Arrays.stream(bobSizes).sum();
        int delta = (sumA - sumB) / 2;
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : aliceSizes) {
            rec.add(num);
        }
        int[] ans = new int[2];
        for (int y : bobSizes) {
            int x = y + delta;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }
}