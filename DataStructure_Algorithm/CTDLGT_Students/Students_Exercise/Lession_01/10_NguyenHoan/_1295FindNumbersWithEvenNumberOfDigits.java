public class _1295FindNumbersWithEvenNumberOfDigits{
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            int numberOfDigit = (int) Math.floor(Math.log10(nums[i])+1);
            if (numberOfDigit%2==0){
                count++;
            }
        }        return count;
        
    }

    public static void main(String[] args) {
        int [] a = {12,345,2,6,7896};
        System.out.print("Array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nNumbers contain an even number of digits: " + findNumbers(a));
    }
}