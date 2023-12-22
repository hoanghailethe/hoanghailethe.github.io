public class _141_LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void print(ListNode head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            System.out.println("-------------");
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode temp = head;
        if (temp == null)
            return false;
        int pos = 1;
        while (temp != null) {
            ListNode temp2 = head;
            for (int i = 0; i < pos; i++) {
                if (temp.next == temp2) {
                    return true;
                } else {
                    temp2 = temp2.next;
                }
            }
            temp = temp.next;
            pos++;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(1);

        n1.next = n2;
        // n1.next = n1;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        // n3.next = n1;
        // print(n1);
        System.out.println(hasCycle(n1));
    }
}
