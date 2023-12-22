import java.util.HashMap;
import java.util.Map;
import jdk.internal.joptsimple.util.PathProperties;

class _997FindtheTownJudge {

  public static int findJudge(int N, int[][] trust) {
    int[] believeInMe = new int[N + 1];
    int[] ibelieveIn = new int[N + 1];

    for (int i = 0; i < trust.length; i++) {
      int[] t = trust[i];

      ibelieveIn[t[0]]++;
      believeInMe[t[1]]++;
    }
    for (int i = 1; i <= N; i++) {
      if (believeInMe[i] == (N - 1) && ibelieveIn[i] == 0) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[][] trust = { { 1, 2 }, { 2, 3 } };
    int N = 3;

    System.out.println(findJudge(N, trust));
    //Map<Integer, Integer> myMap = new HashMap<>();
    // for (int i = 0; i < trust.length; i++) {
    //   int[] distinctTrust = trust[i];
    //   int person1 = distinctTrust[0];

    //   if (myMap.containsKey(person1) == false) {
    //     myMap.put(person1, 1);
    //   }
    // }
    // for (int i = 0; i < trust.length; i++) {
    //   int[] is = trust[i];
    //   int person2 = is[1];

    //   if (myMap.containsKey(person2) == false) {
    //     return person2;
    //   }
    // }
    // return -1;
  }
}
