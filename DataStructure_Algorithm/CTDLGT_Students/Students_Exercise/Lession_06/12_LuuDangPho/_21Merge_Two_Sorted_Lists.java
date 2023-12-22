public class _21Merge_Two_Sorted_Lists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //Dieu kien dung | BTCS
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // Truong hop tong quat
        if (l1.val <= l2.val) { // lay phan tu cua L1
            ListNode nextL1 = l1.next;
            ListNode nextElement = mergeTwoLists(nextL1, l2);
            l1.next = nextElement;
            return l1;
        } else { // Lay mot phan tu cua l2
            mergeTwoLists(l2, l1);
            return l2;
        }
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;

        printLinkedList(n1);
        printLinkedList(l1);

        ListNode newList = mergeTwoLists(n1, l1);
        printLinkedList(newList);
    }
}
