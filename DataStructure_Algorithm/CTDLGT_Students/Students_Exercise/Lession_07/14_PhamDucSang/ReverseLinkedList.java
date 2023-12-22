package com.bt;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    ListNode head1;

    public ListNode reverseList(ListNode head) {
        ListNode curentNode = head;
        ListNode preNode = null;
        ListNode nextNode = null;

        while (curentNode != null) {
            nextNode = curentNode.next;
            curentNode.next = preNode;
            preNode = curentNode;
            curentNode = nextNode;
        }
        head = preNode;
        return preNode;
    }

    public static void main(String[] args) {
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;

        ReverseLinkedList test = new ReverseLinkedList();
        test.head1 = node_1;
        ListNode node =  test.reverseList(test.head1);
        System.out.println();

    }
}
