package TodoServer.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task{
    private int id;
    private String title;
    private boolean completed;

//overide equals
    //https://stackoverflow.com/questions/6187294/java-set-collection-override-equals-method


}
