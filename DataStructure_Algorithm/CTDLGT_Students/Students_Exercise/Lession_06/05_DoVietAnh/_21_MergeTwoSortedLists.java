package anhdv;

/**
 *
 * @author anhdv
 */
public class _21_MergeTwoSortedLists {
    
    ListNode head;
    
    public _21_MergeTwoSortedLists() {
    }
    
    public void addAtHead(int val) {
        //B1. Tao node
        ListNode newNode = new ListNode(val);

        //B2. Noi dit cua newNode vao dau cua head
        newNode.next = head;

        // B3. chuyen con tro head vao newNode
        head = newNode;
    }

    public static void printLinkedList(ListNode head) {
        if(head == null)
            System.out.println("List is empty!");
        else {
            System.out.println("--------------------");
            ListNode temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println("\n--------------------");
        }
    }
    
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mylist = new ListNode(0);
        ListNode head = mylist;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                mylist.next = l1;
                l1 = l1.next;
                mylist = mylist.next;
            } else {
                mylist.next = l2;
                l2 = l2.next;
                mylist = mylist.next;
            }
            if (l1 == null)
                mylist.next = l2;
            
            if (l2 == null) 
                mylist.next = l1;
        }
        return head.next;
    }
    
    public static void main(String[] args) {
        _21_MergeTwoSortedLists listNode1 = new _21_MergeTwoSortedLists();
        listNode1.addAtHead(4);
        listNode1.addAtHead(2);
        listNode1.addAtHead(1);
        
        _21_MergeTwoSortedLists listNode2 = new _21_MergeTwoSortedLists();
        listNode2.addAtHead(4);
        listNode2.addAtHead(3);
        listNode2.addAtHead(1);
        
        ListNode resultList = mergeTwoLists(listNode1.head, listNode2.head);
        printLinkedList(resultList);
    }
}
