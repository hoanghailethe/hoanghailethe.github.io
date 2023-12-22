public class DesignLinkedList {
    /**
     * Initialize your data structure here.
     */
    public class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }
    }

    Node head;

    public DesignLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (head == null) {
            return -1;
        }

        if (index == 0) {
            return head.value;
        } else {
            Node temp = head;
            int currentIndex = -1;
            while (temp != null) {
                currentIndex++;
                if (currentIndex == index) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node currentNode = new Node(val);
        if (head == null) {
            head = currentNode;
        } else {
            currentNode.next = head;
            head = currentNode;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node currentNode = new Node(val);
        if (head == null) {
            head = currentNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = currentNode;
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else {
            Node current = new Node(val);
            Node temp = head;
            int currentIndex = -1;
            while (temp != null) {
                currentIndex++;
                if (currentIndex == index - 1) {
                    Node addNode = temp.next;
                    temp.next = current;
                    current.next = addNode;

                    break;
                }

                temp = temp.next;
            }
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            int currentIndex = -1;
            Node temp = head;
            while (temp != null) {
                currentIndex++;
                if (currentIndex == index - 1) {
                    Node delNode = temp.next;
                    if (delNode == null) {
                        return;
                    } else {
                        temp.next = delNode.next;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
}
