public class _206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode runNode = head;
        ListNode nodeHolder; 
        ListNode runNodeCopy = new ListNode(runNode.val, runNode.next); //copy of HEAD
        runNodeCopy.next = null;

        while(runNode.next != null) {            
            nodeHolder = runNodeCopy; //nodeHolder now hold the head.next...
            runNodeCopy = new ListNode(runNode.next.val, runNode.next.next);
            runNodeCopy.next = nodeHolder;
            runNode = runNode.next;

        }  
        return runNodeCopy;
    }
}
