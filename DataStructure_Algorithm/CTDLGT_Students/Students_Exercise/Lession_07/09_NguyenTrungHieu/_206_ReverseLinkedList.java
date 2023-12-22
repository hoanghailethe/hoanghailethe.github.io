import java.util.ArrayList;
import java.util.List;

public class _206_ReverseLinkedList {
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

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<ListNode> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head);
            head = head.next;
        }
        head = arr.get(arr.size() - 1);
        int i = arr.size() - 2;
        ListNode temp = head;
        while (i >= 0) {
            temp.next = arr.get(i);
            temp = temp.next;
            i--;
            temp.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        // ListNode n2 = new ListNode(2);
        // ListNode n3 = new ListNode(32);
        // ListNode n4 = new ListNode(12);
        // ListNode n5 = new ListNode(5);
        // n1.next = n2;
        // n2.next = n3;
        // n3.next = n4;
        // n4.next = n5;
        // print(n1);
        print(reverseList(n1));
    }

    public static void print(ListNode head) {
        if (head == null) {
            System.out.print(head);
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
