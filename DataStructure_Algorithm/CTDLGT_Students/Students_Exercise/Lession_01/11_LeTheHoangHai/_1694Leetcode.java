import java.util.ArrayList;

public class _1694Leetcode {
    public String reformatNumber(String number) {
        char[] numbers =  number.toCharArray();
        ArrayList<Character> nums = new ArrayList<>();

        for(int i = 0; i< numbers.length; i++) {
            if(numbers[i] != ' ' && numbers[i] != '-') {
                nums.add(numbers[i]);
            }
        }

        int remainder = nums.size() % 3;
        String result ="";

        if(remainder == 1) {
            for( int i= 1; i <= nums.size(); i++) {            
                result += nums.get(i-1);                
                if(i % 3 == 0 && i < nums.size() -1) {
                    result += "-";    
                }
                if(i==nums.size() -2) {
                    result += "-"; 
                }
            }
        } else {
            for( int i= 1; i <= nums.size(); i++) {            
                result += nums.get(i-1);                
                if(i % 3 ==0 && i < nums.size()) {
                    result += "-";    
                }
            }
        }
        return result;

        // if(nums.size() == 4 || remainder == 2) {
        //     nums.add(0,' ');
        // }
        // for( int i= 1; i <= nums.size(); i++) {     
        //     result += nums.get(i-1);         
        //     if(i % 3 ==0 && i < nums.size() -1) {
        //         result += "-";    
        //     }
        // }
        // result = result.trim();
        // return result;
    }
}