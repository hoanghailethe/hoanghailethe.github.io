import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * SampleDFSByStack
 */
public class SampleDFSByStack {

    public static void main(String[] args) {
        int[][] graph = {   { 0, 1, 0, 0, 0, 0, 0}, 
                            { 1, 0, 1, 1, 1, 0, 0},
                            { 0, 1, 0, 0, 0, 1, 0},
                            { 0, 1, 0, 0, 0, 1, 1},
                            { 0, 1, 0, 0, 0, 0, 1},
                            { 0, 0, 1, 1, 0, 0, 0},
                            { 0, 0, 0, 1, 1, 0, 0}};
        int n = graph.length;
        
        // Khai bao
        Stack<Integer> stack = new Stack<>();
        Set<Integer> daDuyet = new HashSet<>();

        // B1:
        stack.push(0);
        daDuyet.add(0);

        while(!stack.isEmpty())
        {
            int u = stack.pop();
            // process: in ra man hinh
            System.out.print(u + " ");

            // Tim dinh ke v, ke voi u nhet vao stack
            // va v phai chua duoc duyet
            for (int v = 0; v < n; v++) {
                if(graph[u][v] == 1 && daDuyet.contains(v) == false){
                    stack.add(v);
                    daDuyet.add(v);
                }
            }
        }

    }
}