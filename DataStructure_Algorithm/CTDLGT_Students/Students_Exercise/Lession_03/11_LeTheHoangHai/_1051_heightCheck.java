import java.util.Arrays;

public class _1051hieghtCheck {
    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] oldheight = Arrays.copyOf(heights, heights.length);
        int[] sortedStudents = sorted(heights);
        for(int i = 0; i< heights.length; i++) {
            if (sortedStudents[i] != oldheight[i]) {
                count++;
            }
        }
        return count;
    }
        
    public static int[] sorted(int[] heights){
        for(int i = 0; i<heights.length-1; i++){
            int a = heights[i+1];
            for(int j= i; j >= 0; j--) {
                int b = heights[j];
                if( a < b) {         
                    heights[j+1] = heights[j];
                    heights[j] = a;
                } else {
                    break;
                }
                
            }
        }
        return heights;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
