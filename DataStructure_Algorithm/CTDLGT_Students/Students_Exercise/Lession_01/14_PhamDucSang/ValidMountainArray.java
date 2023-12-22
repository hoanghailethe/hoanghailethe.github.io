public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex+1 < arr.length && arr[leftIndex] < arr[leftIndex+1]) {
            leftIndex++;
        }
        while (rightIndex-1 >= 0 && arr[rightIndex] < arr[rightIndex-1]) {
            rightIndex--;
        }

        if (leftIndex == arr.length -1 || rightIndex == 0) {
            return false;
        }
        return leftIndex == rightIndex;
    }
}
