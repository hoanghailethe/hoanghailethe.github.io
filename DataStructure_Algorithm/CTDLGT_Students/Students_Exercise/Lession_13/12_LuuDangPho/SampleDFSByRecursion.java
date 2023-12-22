import java.util.HashSet;
import java.util.Set;

public class SampleDFSByRecursion {


    public static void duyetDFS(int u, int[][] graph, Set<Integer> daDuyet)
    {
        int n = graph.length;

        //process
        System.out.print(u + " ");

        // Tim tat ca dinh ke cua u, ma chua duyet
        for (int v = n-1; v >= 0; v--) {
            if(graph[u][v] == 1 && daDuyet.contains(v) == false){
                daDuyet.add(v);
                
                duyetDFS(v, graph, daDuyet);
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {   { 0, 1, 0, 0, 0, 0, 0}, 
                            { 1, 0, 1, 1, 1, 0, 0},
                            { 0, 1, 0, 0, 0, 1, 0},
                            { 0, 1, 0, 0, 0, 1, 1},
                            { 0, 1, 0, 0, 0, 0, 1},
                            { 0, 0, 1, 1, 0, 0, 0},
                            { 0, 0, 0, 1, 1, 0, 0}};

        Set<Integer> daDuyet = new HashSet<>();
        daDuyet.add(0);
        duyetDFS(0, graph, daDuyet);     
    }
}
