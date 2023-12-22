class FindNumber {
    public static int findNumbers(int[] nums) {
        int dem = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i]))
                dem++;
        }
        return dem;
    }

    public static boolean isEven(int nums) {
        String y = String.valueOf(nums);
        if (y.length()%2== 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }
}