public class _203_RemoveLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            this.val = x;
            // next = null;
        }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
            ListNode temp = head;
            ListNode prev = null;
            while (temp != null) {
                if(temp.val == val){
                    if(prev == null){
                        head = temp.next;
                    } else {
                        prev.next = temp.next;
                    }
                }
                prev = temp;
                temp = temp.next;
            }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        // ListNode n4 = new ListNode(4);
        // ListNode n5 = new ListNode(5);
        // ListNode n6 = new ListNode(6);
        // n1.next = n2;
        // n2.next = n3;
        // n3.next = n4;
        // n4.next = n5;
        // n5.next = n6;
        removeElements(n1, 1);
        print(n1);
    }

    public static void print(ListNode head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
}
