import java.sql.Array;
import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] temp = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != temp[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }
}
