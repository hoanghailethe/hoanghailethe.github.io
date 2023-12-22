public class _141_LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null|| head.next == null) return false;
        
        ListNode run = head;
        int pos = 0;
        
        while (run.next != null ){
            run = run.next;
            pos++;
            
            ListNode run2 = head;
            for (int i =0; i < pos; i++ ){
                if (run == run2) {
                    return true;
                }
                run2 = run2.next;
            }
            
        }
        return false;
    }
    

    public static void main(String[] args) {
        ListNode a = new ListNode(1, new ListNode(2));
        System.out.println(hasCycle(a));
    }
}
