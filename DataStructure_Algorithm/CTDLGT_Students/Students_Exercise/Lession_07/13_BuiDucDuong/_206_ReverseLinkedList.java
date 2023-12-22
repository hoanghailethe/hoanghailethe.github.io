
public class _206_ReverseLinkedList {
    public class ListNode {
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

    // Cách 1 ko dùng đệ quy
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while (head.next != null) {
            ListNode node = head.next;
            head.next = node.next;
            node.next = temp;
            temp = node;
        }
        return temp;
    }
}
