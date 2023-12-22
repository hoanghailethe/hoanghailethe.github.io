import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SampleBFSByQueue {
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
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> daDuyet = new HashSet<>();

        // B1:
        queue.add(0);
        daDuyet.add(0);

        while(!queue.isEmpty())
        {
            int u = queue.poll();
            // process: in ra man hinh
            System.out.print(u + " ");

            // Tim dinh ke v, ke voi u nhet vao stack
            // va v phai chua duoc duyet
            for (int v = 0; v < n; v++) {
                if(graph[u][v] == 1 && daDuyet.contains(v) == false){
                    queue.add(v);
                    daDuyet.add(v);
                }
            }
        }
    }
}
