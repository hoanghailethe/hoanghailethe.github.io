public class MyLinkedList {
    Node head;

    public MyLinkedList() {

    }

    public void addAtHead(int val) {
        // B1. tao node
        Node newNode = new Node(val);
        // B2. Noi dit cua newNode vafo dau cua head
        newNode.next = head;
        // B3. chuyen con tro head vao newNode
        head = newNode;
    }

    public int get(int index) {
        if (head == null) {
            return -1;
        }
        if (index == 0) {
            return head.value;
        } else {
            Node temp = head;
            int curIndex = -1;

            while (temp != null) {
                curIndex++;

                if (curIndex == index) {
                    return temp.value;
                }

                temp = temp.next;
            }
        }
        return -1;
    }


    public void addAtTail(int val) {
        //B1. tao node moi
        Node newNode = new Node(val);

        if (head == null) {
            //B2. tim node rong
            head = newNode;
        } else {
            //B2. tim node last
            Node lastNode = head;
            while (lastNode != null) {
                lastNode.next = lastNode.next;
            }
            //B3. add at tail vao node
            lastNode.next = newNode;
        }
    }

    public void addAtIndex(int index, int val) {

        //B2. Tim index -1
        if (index == 0) {
            addAtHead(val);
        } else {
            //B1. Tao node moi
            Node newNode = new Node(val);
            int curIndex = -1;
            Node temp = head;
            while (temp != null) {
                curIndex++;
                if (curIndex == index - 1) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }

                temp = temp.next;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            //B1. di tim node index -1
            Node temp = head;
            int curIndex = -1;
            while (temp != null) {
                curIndex++;
                if (curIndex == index - 1) {
                    Node delNode = temp.next;
                    if (delNode == null) {
                        return;
                    } else {
                        temp.next = delNode.next;
                    }

                }
            }
        }
    }

    public void show() {
        printLinkedList(head);
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            System.out.println("-------------------------");
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        MyLinkedList myList2 = new MyLinkedList();
        MyLinkedList myList3 = new MyLinkedList();

        myList3.addAtIndex(0, 1);
        myList3.addAtIndex(1, 2);
        myList3.addAtIndex(2, 3);
        myList3.deleteAtIndex(0);
        myList3.show();

        myList.addAtHead(1);
        myList.addAtHead(2);
        myList.addAtHead(9);
        myList.show();
        myList2.addAtIndex(0, 1);
        myList2.addAtIndex(0, 2);
        myList2.addAtIndex(0, 3);
        myList2.show();
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        n1.next = n2;
//        n2.next = n3;
//
//        printLinkedList(n1);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

