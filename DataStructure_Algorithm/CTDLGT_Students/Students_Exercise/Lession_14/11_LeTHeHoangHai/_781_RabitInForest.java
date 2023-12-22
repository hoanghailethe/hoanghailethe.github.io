import java.util.HashSet;
import java.util.Set;

public class _781_RabitInForest {
    public static int numRabbits(int[] answers) {
        int[] answer = new int[150];
        int min = 0;
        Set<Integer> sameValueOrIndex = new HashSet<>();

        // numberOther is the answer of HOWMANY other Rabit have same color
        for (int numberOther : answers) {
            if (numberOther == 0) {
                min++;
            } else {
                answer[numberOther]++;
            }
            sameValueOrIndex.add(numberOther);
        }

        for (int i : sameValueOrIndex) {
            if (i == 0)
                continue;
            // for EXP: answ 1 only cause exception when number of 1 > 2. <= 2 can still
            // count the same...
            // and not every Rabit in the forrest is asked
            if (answer[i] <= (i + 1))
                min += (i + 1); // becasue i start from 0, but count start from 1.
            if (answer[i] > (i + 1)) {
                int devide = answer[i] / (i + 1);
                int remain = answer[i] % (i + 1);
                // here it make sense... I find the LOGIC BUG HERE after writing down the process
                //there is one more BUG: IF remaider = 0. We dont add 1 to the SUM ADD.
                //Fix....
                //int add = (remain==0) ? (i + 1) * devide : (i + 1) * devide + (remain * i + 1); 
                
                int devideOfRemainder = (int) (remain/ (i+1));
                int addOfRemainder = (devideOfRemainder+1) * (i+1);
                int add = 0;
                if(remain != 0) {
                    add = (i+1)*devide + addOfRemainder;
                } else {
                    add = (i+1)*devide;
                }
                min += add;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // int[] a = {1,0,1,0,0};
        //int[] a = { 2, 1, 2, 2, 2, 2, 2, 2, 1, 1 };
        //int[] a = {3,3,3,3,3,3,3};
        int []a = {0,0,0, 1,2,2,3,3,3,3,3,3,3,4,4,4,4,4,4};
        System.out.println(numRabbits(a));
    }
}
