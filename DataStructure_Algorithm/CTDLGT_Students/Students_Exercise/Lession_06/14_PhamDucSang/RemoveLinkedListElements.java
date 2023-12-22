public class RemoveLinkedListElements {
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

    public ListNode removeElements(ListNode head, int val) {
        ListNode currNode = head;
        ListNode prevNode = null;

        while (currNode != null) {
            if (currNode.val == val) {
                if (prevNode != null) {
                    prevNode.next = currNode.next;
                } else {
                    head = head.next;
                }
            } else {
                prevNode = currNode;
            }

            currNode = currNode.next;
        }
        return head;
    }
}
