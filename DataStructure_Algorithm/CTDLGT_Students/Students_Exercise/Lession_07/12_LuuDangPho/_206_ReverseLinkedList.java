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
        return temp;
    }
}
