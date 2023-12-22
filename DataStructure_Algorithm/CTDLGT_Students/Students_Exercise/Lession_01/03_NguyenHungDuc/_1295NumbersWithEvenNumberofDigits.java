import jdk.internal.joptsimple.util.PathProperties;

class _1295NumbersWithEvenNumberofDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {

            if (digits(n, nums) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int digits(int n, int []arr){
        int digit = 0;
        
        while (n > 0) {
            n/=10;
            digit++;
            
        }
        
        return digit;

    
    }
    
    public static void main(String[] args) {
        int[] arr = { 12, 345, 1112, 6, 7896 };
        System.out.print("Số có số lượng kí tự chẵn là: ");
        System.out.println(findNumbers(arr));
        
    }
}