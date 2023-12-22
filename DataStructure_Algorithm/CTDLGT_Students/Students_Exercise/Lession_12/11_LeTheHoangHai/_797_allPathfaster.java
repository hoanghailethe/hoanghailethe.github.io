import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _797_allPathfaster {
    public static void add2Path (int index,int[][] graph, List<Integer> building, List<List<Integer>> allPaths) {
        building.add(index);

        if(index == graph.length -1) {
            allPaths.add(new ArrayList<>(building));
            return;
        }       
        //if(graph[index] == null) return; 
        if(graph[index].length == 0) return;
                
        //index is the index number of "dinh" adding to path/
        for(int i = 0; i< graph[index].length; i++) {
//IMPROVEMENT big from here with recursion and remove 1 element each time after Recur
            //the index index
            int nextIndex = graph[index][i];
            add2Path(nextIndex, graph, building, allPaths);
            building.remove(building.size() - 1);           
        }
        return;
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new ArrayList<>();      
        List<Integer> building = new ArrayList<>();      
        add2Path(0, graph, building, allPaths);
        return allPaths;
    }

    public static void main(String[] args) {
        //int[][] test1 = {{1,2},{3},{3},{}};
        int[][] test1 = {{4,3,1},{3,2,4},{3},{4},{}};
        System.out.println(allPathsSourceTarget(test1));
    }
}
