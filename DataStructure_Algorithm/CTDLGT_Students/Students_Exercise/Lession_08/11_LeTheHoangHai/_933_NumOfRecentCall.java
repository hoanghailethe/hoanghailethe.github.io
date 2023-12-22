import java.util.LinkedList;
import java.util.Queue;

public class _933_NumOfRecentCall {
    Queue<Integer> time;

    public _933_NumOfRecentCall() {
        time = new LinkedList<>();
    }

    public int ping(int t) {
        time.add(t);
        int timeCheck = time.size() - 1;
        for (int i = 0; i < timeCheck; i++) {
            if (time.peek() < (t - 3000)) {
                time.poll();
            } else {
                break;
            }
        }

        return time.size();
    }

}


