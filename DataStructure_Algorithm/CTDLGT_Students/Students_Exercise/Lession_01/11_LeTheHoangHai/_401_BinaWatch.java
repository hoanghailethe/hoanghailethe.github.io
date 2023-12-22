import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class _401_BinaWatch {
    
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        
        List<Integer> allHours = new LinkedList<>();
        List<Integer> allMinutes = new LinkedList<>();
        
        //Create all the Pattern Posible for hours
        int a = 0;
        for(int i = 0; i< 4; i++) { //4 is the max hourLEds
            allHours.add(a);
            allHours.add(++a);
            a*=10;
        }
        
        int b = 0;
        for(int i = 0; i< 6; i++) {
            allMinutes.add(b);
            allMinutes.add(++b);
            b*=10;
        }
        
        StringBuilder timeNow = new StringBuilder();
        for(int hourLedsAreOn = 0; hourLedsAreOn <= 3; hourLedsAreOn++) {
            if(turnedOn<hourLedsAreOn) break;
            int minLedsAreOn = turnedOn - hourLedsAreOn;
            
            time(hourLedsAreOn, minLedsAreOn, allHours, allMinutes, result ,timeNow);
                
            // result.add(timeNow.toString())
            // timeNow.clear();
            
        }
        
        return result;
    }
    
    private static void time(int hourLEDs, int minuteLEDs,List<Integer> allHours,List<Integer> allMinutes, List<String> result, StringBuilder timeNow ) {
        
        List<Integer> hoursPossible = new LinkedList<>();
        List<Integer> minsPossible = new LinkedList<>();
        
        for(int hour : allHours) {
            int test = hour;
            int count = 0;
            int time = 4; //time to test hour
            
            while(time > 0) {
                if(test % 10 == 1) count++;  //0 Or 1 
                test /= 10;
                
                time--;
            }
            
            int deciHour = 0;
            if(count ==  hourLEDs){
                int binaHour = hour;
                time = 4; //time to converse
                int base = 1;
                while(time > 0) {
                    deciHour += (binaHour%10) * base;
                    base *= 2;
                    binaHour/=10;
                    time--;
                }
                
            if (deciHour < 12) hoursPossible.add(deciHour);
            }//end if
            
        } //end for loop
        
        for(int minute : allMinutes) {
            int test = minute;
            int count = 0;
            int time = 6; //time to test hour
            
            while(time > 0) {
                if(test % 10 == 1) count++;  //0 Or 1 
                test /= 10;
                time--;
            }
            
            int deciMin = 0;
            if(count ==  minuteLEDs){
                int binaMin = minute;
                time = 6; //time to converse
                int base = 1; //multiply
            
                while(time > 0) {
                    
                    deciMin += (binaMin%10) * base;
                    binaMin/=10;
                    base *= 2;                   
                    time--;
                } //end while
            if (deciMin < 60) minsPossible.add(deciMin);
            }//end if         
        } //end while
        
        for(int hour : hoursPossible) {
            for(int min : minsPossible) {     
                timeNow.append(hour+":");

                if(min>=10) {
                    timeNow.append(min);
                }else {
                    timeNow.append("0"+min);
                }         
                result.add(timeNow.toString());
                timeNow.setLength(0);
            }
        }
             
    }

    public static void main(String[] args) {
        int turnedOn = 1;
        System.out.println(readBinaryWatch(turnedOn));
    }
}