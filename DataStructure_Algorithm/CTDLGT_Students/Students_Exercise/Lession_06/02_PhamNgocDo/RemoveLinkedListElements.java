public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp= head;
        if(head==null) return null;
        while(temp.val==val){
            if(temp.next==null && temp.val==val) return null;
            temp=temp.next;
            if(temp.val!=val) break;
        }
        head=temp;
        while(temp.next!=null){
            if(temp.next.val==val) temp.next=temp.next.next;
            else temp=temp.next;
        }
         return head;
     }
}