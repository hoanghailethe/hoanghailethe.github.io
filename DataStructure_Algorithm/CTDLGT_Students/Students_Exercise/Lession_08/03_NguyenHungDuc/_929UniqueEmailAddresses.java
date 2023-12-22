class _929UniqueEmailAddresses {
    public static int numUniqueEmails(String[] emails) {
        String[] newStr = new String[emails.length];
        int countSimilar = 0;
        int count = emails.length;
        for (int i = 0; i < newStr.length; i++) {
            newStr[i] = normalize(emails[i]);
            // System.out.println(newStr[i]);
        }


        for (int i = 0; i < newStr.length; i++) {
            
            for (int j = 0; j < i; j++) {
                if (newStr[j].equals(newStr[i])) {
                    countSimilar++;
                    break;
                }
            }
            
        }
        int unique = count - countSimilar;
        
        return unique;
    }

    public static String normalize(String s) {
        StringBuilder str = new StringBuilder(s);
        

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                str.deleteCharAt(i);
            } else if (c == '+') {
                str.delete(i, str.indexOf("@"));
            }

            if (c == '@' || c == '+') {
                break;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String[] emails = {"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"};
        
        System.out.println(numUniqueEmails(emails));
        
    }
}