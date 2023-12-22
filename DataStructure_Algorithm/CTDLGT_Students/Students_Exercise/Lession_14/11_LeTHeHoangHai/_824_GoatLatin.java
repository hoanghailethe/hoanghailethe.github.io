public class _824_GoatLatin {
    public String toGoatLatin(String sentence) {
           String[] sent = sentence.split(" ");
           String[] result = new String[sent.length];

           for (int i = 0; i<sent.length; i++) {
               String a = sent[i];
               char begin = Character.toLowerCase(a.charAt(0)) ;
               String build = "";

               if(begin != 'a' && begin != 'e' && begin != 'i' && begin != 'o' && begin != 'u') {
                    build += a.substring(1) + a.charAt(0) + "ma";
               } else {
                   build += a + "ma";
               }
               for(int j = i; j >= 0; j--) {
                   build += "a";
               } 
               result[i] = build;
           }

           return String.join(" ", result);
    }
}
