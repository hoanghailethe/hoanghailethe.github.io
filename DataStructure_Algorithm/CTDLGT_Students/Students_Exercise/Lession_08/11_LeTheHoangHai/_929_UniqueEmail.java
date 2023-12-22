import java.util.ArrayList;
import java.util.List;

public class _929_UniqueEmail {
    public static int numUniqueEmails(String[] emails) {
        List<String> differentMail = new ArrayList<>();
        
        for(int i =0; i< emails.length; i++) {
            String emailI = emails[i] ;
 
            int b = emailI.indexOf("@");

            String localName = emailI.substring(0, b);
            String domainName = emailI.substring(b);

            localName = localName.replace(".", "");
            int a = localName.indexOf("+");
            if(a != -1 ) {
                localName = localName.substring(0, a);
            }

            emailI = localName + domainName;

            if(!differentMail.isEmpty()) {
                boolean duplicate = false;
                for(int j = 0; j< differentMail.size(); j++) {
                    if(emailI.equals(differentMail.get(j))) {
                        duplicate =true;
                        break;
                    }
                }
                if (duplicate) differentMail.add(emailI);
            } else {
                differentMail.add(emailI);
            }
        }

        return differentMail.size();
    }

    public static void main(String[] args) {
        //String [] test = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String [] test = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(test));
    }
}
