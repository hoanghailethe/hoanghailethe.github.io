public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == arr[i] * 2) {
                        return true;
                    }
                }
            } else {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }
}
