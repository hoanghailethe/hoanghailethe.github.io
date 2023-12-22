public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head ;
        ListNode tail ;
        if (l1.val < l2.val) {
            tail = l1;
            l1 = l1.next;
        } else {
            tail = l2;
            l2 = l2.next;
        }
        head = tail;
        while(l1 != null & l2!=null){
            if(l1.val < l2.val){
                tail.next =l1;
                tail = tail.next;
                l1 = l1.next;
            } else{
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }
        if(l1==null && l2 != null){
            tail.next= l2;
        }
        if(l2==null && l1!= null){
            tail.next = l1;
        }
        return head;

    }
    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("list is empty !");
            return;
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next=node2;
        node2.next=node3;
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        printLinkedList(mergeTwoLists(node1, n1));
    }
}
