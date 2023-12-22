public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == 0) {
                for (int i = arr.length - 2; i >= index; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[index] = 0;
                index++;
            }
            index++;
        }
    }
}
