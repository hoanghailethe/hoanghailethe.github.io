package CTDLGT_Students.Students_Exercise.Lession_06.04_TruongBaThuong;

public class 203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
    if(head == null) return null;
        if(head.val == val) return removeElements(head.next, val);
        
        ListNode temp = head;

        while(head.next != null) {
            if(head.next.val == val) head.next = head.next.next;
            else head = head.next;
        }
        
        return temp;
        
    }
}
