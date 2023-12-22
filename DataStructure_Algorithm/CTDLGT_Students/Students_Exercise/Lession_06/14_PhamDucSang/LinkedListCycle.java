public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp.val = Integer.MAX_VALUE;
            temp = temp.next;
            if (temp.val == Integer.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }
}
