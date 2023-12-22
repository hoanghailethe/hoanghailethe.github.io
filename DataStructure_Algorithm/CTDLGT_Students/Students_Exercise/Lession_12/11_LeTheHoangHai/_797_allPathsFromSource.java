import java.util.LinkedList;
import java.util.List;

public class _797_allPathsFromSource {
    public static void add2Path (int index,int[][] graph, List<Integer> building, List<List<Integer>> allPaths) {
        if(graph[index] == null) return; 
        int target = graph.length -1;  // the final node we will stop
        //add the value of index to the node:
        //index of first array represent the number adding
        building.add(index);    
            
        if(index == target) {
            allPaths.add(building);
            return;
        }

        //index is the index number of "dinh" adding to path/

        int n = graph[index].length; //allthe Case
        for(int i = 0; i< n; i++) {
            //here is the big KNOT to solve the BUG...
            List<Integer> buildingClone = new LinkedList<>(building);
            //the index index
            int nextIndex = graph[index][i];

            if(!building.contains(nextIndex)) { 
                add2Path(nextIndex, graph, buildingClone, allPaths);
            }
             
        }
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new LinkedList<>();      
        List<Integer> building = new LinkedList<>();      
        add2Path(0, graph, building, allPaths);
        return allPaths;
    }

    public static void main(String[] args) {
        //int[][] test1 = {{1,2},{3},{3},{}};

        int[][] test1 = {{4,3,1},{3,2,4},{3},{4},{}};
        System.out.println(allPathsSourceTarget(test1));
    }
}
