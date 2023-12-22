public class Bai21 {
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

    public static ListNode getSmallerNode(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val <= l2.val)
            return l1;
        return l2;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode head = null;

        while (l1 != null || l2 != null) {
            ListNode nextNode = getSmallerNode(l1, l2);
            
            if (nextNode != null) 
            {
                if (l3 == null) {
                    head = nextNode;
                    l3 = nextNode;
                } else {
                    l3.next = nextNode;
                }

                // Thang nao duoc chon thi nhay 1 buoc
                if (nextNode == l1) {
                    l1 = l1.next;
                } else {
                    l2 = l2.next;
                }

                // B3. Cho l3 vao vi tri hien tai
                l3 = nextNode;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        ListNode n2 = new ListNode(2);
        ListNode n4 = new ListNode(4);

        n1.next = n3;
        n3.next = n5;

        n2.next = n4;

        ListNode kq = mergeTwoLists(n1, n2);
        int k = 0;
    }
}
