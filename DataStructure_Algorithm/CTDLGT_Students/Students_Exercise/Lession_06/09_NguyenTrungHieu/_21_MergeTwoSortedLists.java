public class _21_MergeTwoSortedLists {
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
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode head = null;
        ListNode temp = head;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    head = l1;
                    l1 = l1.next;
                    head = head.next;
                } else {
                    head = l2;
                    l2 = l2.next;
                    head = head.next;
                }
            } else {
                if (l1 != null) {
                    head = l1;
                    l1 = l1.next;
                    head = head.next;
                } else if ( l2 != null) {
                    head = l2;
                    l2 = l2.next;
                    head = head.next;
                }
            }
        }
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);
        n4.next = n5;
        n5.next = n6;
        System.out.print("list1: ");
        print(n1);
        System.out.print("list2: ");
        print(n4);
        print(mergeTwoLists(n1, n2));
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
