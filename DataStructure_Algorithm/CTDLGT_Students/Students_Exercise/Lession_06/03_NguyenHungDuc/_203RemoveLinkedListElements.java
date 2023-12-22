class _203RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int value) {
        ListNode curNode = head;
        ListNode prevNode = null;
        if (head == null) {
            return null;
        } else {
            while (curNode.next != null) {
                prevNode = curNode;
                if (curNode.val == value) {
                    prevNode.next = curNode.next;
                }
                curNode = curNode.next;
            }
        }
        return curNode;
    }

    public static void show(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(7);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(6);

        show(removeElements(head, 6));
    }
}