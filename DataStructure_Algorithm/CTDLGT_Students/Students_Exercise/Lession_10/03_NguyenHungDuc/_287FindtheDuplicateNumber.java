class _287FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int valueCount = 0;
        for (int i : nums) {
            if (myMap.containsKey(i) == false) {
                myMap.put(i, 1);
            } else {
                valueCount = myMap.get(i) + 1;
                myMap.put(i, valueCount);
            }
        }
        
        for (int i : nums) {
            if (myMap.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }
}