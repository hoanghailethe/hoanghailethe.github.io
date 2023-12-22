package anhdv;

/**
 *
 * @author anhdv
 */
public class _203_RemoveLinkedListElements {
    
    ListNode head;
    
    public _203_RemoveLinkedListElements() {
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
    
    static ListNode removeElements(ListNode head, int val) {
        ListNode list = new ListNode(Integer.MIN_VALUE);
        ListNode tail = list;

        while (head != null) {
            if (head.val != val) {
                tail.next = new ListNode(head.val);
                tail = tail.next;
            }
            head = head.next;
        }

        return list.next;
    }
    
    public static void main(String[] args) {
        _203_RemoveLinkedListElements list = new _203_RemoveLinkedListElements();
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(1);
        
        ListNode newNode = removeElements(list.head, 1);
        printLinkedList(newNode);
    }
}
