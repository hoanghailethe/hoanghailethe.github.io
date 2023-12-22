public class _203_RemoveLinkedList {
    public static ListNode removeElements(ListNode head, int val) {  
        ListNode newHead = head;
        
        if (newHead == null) {
            return null;
        } 
        
        newHead.next = removeElements(newHead.next, val);
        
        if (newHead.val == val ) {
            newHead = newHead.next;
        }
        return newHead;
    }
    

    public static void printLinkedList(ListNode head) {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            ListNode temp = head; 
            // Co dau bang la bat dau tro vao (o day la head)

            while(temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

        }
    }
    

    public static void main(String[] args) {
        ListNode a = new ListNode(1, new ListNode (2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
        ListNode b = removeElements(a, 6);

        printLinkedList(b);
        System.out.println();

        // ListNode a = new ListNode(7, new ListNode (7, new ListNode(7, new ListNode(7, null))));
        // ListNode b = removeElements(a, 7);

        // printLinkedList(b);
        // System.out.println();

        // ListNode c = new ListNode(1, new ListNode (2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
        // ListNode d = removeElements(c, 6);
        // printLinkedList(d);
        // System.out.println();
        
    }
}

