public class _997_FindtheTownJudge {
    public static void main(String[] args) {

    }

    /**
     * 5 ms
     * 
     * 81.6 MB
     * 
     * 32.03%
     */
    public int findJudge(int N, int[][] trust) {
        int[][] count = new int[N + 1][2];

        for (int[] is : trust) {
            count[is[0]][0]++;
            count[is[1]][1]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i][0] == 0 && count[i][1] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
