public class _203_Remove_Linked_List_Elements {
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
        ListNode curNode = head;
        ListNode preNode = null;
        while (curNode != null) {
            boolean bFound = false;
            if (curNode.val == val) {
                bFound = true;
                if (preNode == null) {
                    head = curNode.next;
                } else {
                    preNode.next = curNode.next;
                }
            }
            preNode = bFound == true ? preNode : curNode;
            curNode = curNode.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
