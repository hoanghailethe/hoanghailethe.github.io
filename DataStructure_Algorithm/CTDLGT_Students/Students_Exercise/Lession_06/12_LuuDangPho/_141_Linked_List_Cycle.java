public class _141_Linked_List_Cycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        int STEP_MAX = 2;
        while (slow != null) {
            int count = 0;
            while (fast != null) {
                if (fast == slow) {
                    return true;
                }
                fast = fast.next;
                count++;
                if (count == STEP_MAX) {
                    break;
                }
            }
            slow = slow.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }

    public static boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }

        }

        return false;
    }
}
