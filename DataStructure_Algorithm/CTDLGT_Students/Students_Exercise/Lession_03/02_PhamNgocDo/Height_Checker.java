public class Height_Checker {
    public static int[] quickSort(int a[], int l, int r){
        int p = a[(l+r)/2];
        int i = l, j = r;
        while (i < j){
            while (a[i] < p){
                i++;
            }
            while (a[j] > p){
                j--;
            }
            if (i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (i < r){
            quickSort(a, i, r);
        }
        if (l < j){
            quickSort(a, l, j);
        }
        return a;
    }
    public static int heightChecker(int[] heights) {
        int[] a= heights.clone();
        int result=0;
        heights=quickSort(heights, 0, heights.length-1);
        for(int i=0 ; i<a.length; i++){
            if(a[i] != heights[i]) result++;
        }
        return result;
    }
    public static void main(String[] args) {
        int b[] = new int[] { 1,1,4,2,1,3 };
        System.out.println(heightChecker(b));

    }
    
}
