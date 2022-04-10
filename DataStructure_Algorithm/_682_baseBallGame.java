import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

// Runtime: 1 ms, faster than 100.00% of Java online submissions for Baseball Game.
// Memory Usage: 40.4 MB, less than 90.59% of Java online submissions for Baseball Game.
public class _682_baseBallGame {
    public int calPoints(String[] ops) {
        ArrayList <Integer> scores = new ArrayList<>();
        
        for(String op : ops) {
            int size = scores.size();
            switch (op) {
                case "+":
                    int newScore = scores.get(size-1)  + scores.get(size-2) ; 
                    scores.add(newScore);
                    break;
                case "C":
                    scores.remove( size-1 );
                    break;
                case "D":
                    scores.add ( scores.get(size-1) * 2 );
                    break;
                default:
                    scores.add ( Integer.parseInt(op) );

            }
        }

        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        return sum;
    }
}
