import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _609_findDuplicateFIle {
    public static List<List<String>> findDuplicate(String[] paths) {
        
        //my Pseudo Steps:
        // 1. Split input String[] into PATHS and CONTENT: 
            // can be in the same array or 2 diff
            // Problem here is How to Split:
            //"root/a 1.txt(abcd) 2.txt(efgh)"
            // - RootPath --- files name 1 + file2  ---= content -- so it is 3 levels//
            // then we need to combine root +file name at the end... after LOOP the content...
            //
        // 2. Create a Map.HashTable... to put the value of the content in
            //can be type: <String, List> - While String is the CONTENTs of each paths.
            //List hold the PATH that has that Result..
        //3. For loop run throuth all the content INDEX... -> load the Path into the positions
        // 3 Create a result list...
            //loop in the HashTable Key - if the Size of the List is >=2 
            //return
        Map<String, LinkedList<String>> content2Path = new HashMap<>();
        
        for (String input : paths) {            
            String[] divide = input.split(" ");

            //"root/a 1.txt(abcd) 2.txt(efgh)"
            // --> {root/a} + {1.txt(abcd)} + {2.txt(efgh)}

            for(int i = 1; i < divide.length; i++) {
                String fileAndcontent = divide[i]; 
                
                int ind = fileAndcontent.indexOf("(");
                int end = fileAndcontent.length() - 1;

                String fileName = fileAndcontent.substring(0, ind);
                String content = fileAndcontent.substring(ind + 1, end);

                StringBuilder fullPath = new StringBuilder();
                fullPath.append(divide[0]);
                fullPath.append("/");
                fullPath.append(fileName);
 

                LinkedList<String> fileNames = content2Path.getOrDefault(content, new LinkedList<String>());
                fileNames.add(fullPath.toString());
                content2Path.put(content, fileNames);
            }
        }//end for loop

        List<List<String>> result =  new LinkedList<>();
        // for (String content : content2Path.keySet()) {
        //     if(content2Path.get(content).size() >= 2) {
        //         result.add(content2Path.get(content));
        //     }
        // }    
        for (Map.Entry<String,LinkedList<String>> entry : content2Path.entrySet()) {
            //String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value.size() >= 2 ) {
                result.add(value);
            }
          }    
        return result;
    }

    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }
}
