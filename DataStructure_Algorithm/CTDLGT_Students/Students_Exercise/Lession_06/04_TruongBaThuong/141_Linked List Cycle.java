package CTDLGT_Students.Students_Exercise.Lession_06.04_TruongBaThuong;

public class 141_Linked List Cycle {
    public  boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow) {
            return true;
        }
    }
    
    return false;
}
}
