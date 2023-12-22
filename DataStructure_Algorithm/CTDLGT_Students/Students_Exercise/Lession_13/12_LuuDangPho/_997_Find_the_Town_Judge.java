public class _997_Find_the_Town_Judge {
    public int findJudge(int N, int[][] trust) {
        int[] count1 = new int[N + 1];
        int[] count2 = new int[N + 1];
        for (int[] i : trust) {
            count1[i[1]]++;
            count2[i[0]]++;
        }
        for (int i = 1; i < N + 1; i++) {
            if (count1[i] == N - 1 && count2[i] == 0)
                return i;

        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
