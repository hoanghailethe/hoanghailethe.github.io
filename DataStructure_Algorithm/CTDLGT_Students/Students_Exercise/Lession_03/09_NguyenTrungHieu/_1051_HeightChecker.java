public class _1051_HeightChecker {
    public static int heightChecker(int[] arr) {
        int result = 0;
        int[] sortArr = new int[arr.length];
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for (int i = 0; i < sortArr.length; i++) {
            if(arr[i] != sortArr[i]){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        // [1,1,4,2,1,3] [1,1,4,4,1,3]
        System.out.println(heightChecker(arr));
    }
}
