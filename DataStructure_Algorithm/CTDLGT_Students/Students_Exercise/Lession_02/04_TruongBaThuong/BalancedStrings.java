public class BalancedStrings {
        public static int balancedStringSplit(String s) {
            int counter=0;
            for(int i=0; i<s.length(); i++)
            {
                int chcounter=0;

                    if(s.charAt(i)=='L')
                        chcounter--;
                    else
                        chcounter++;
                    if(chcounter==0)
                        counter++;



            }
            return counter;
        }

    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        System.out.println("out:"+balancedStringSplit(s));
    }

}
