public class MyLinkedList {
    /** Initialize your data structure here. */
    Node head;

    public MyLinkedList() {
        //default
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

        if(head == null) return -1;
        if(index == 0) return head.value;

        Node tempt = head;
        int curIndex =0; 
        while (tempt!= null) {
            curIndex++;            
            if (curIndex == index) {
                return tempt.value;
            }
            tempt = tempt.next;
        }
        return -1; 
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        //B1. tao nnode
        Node newNode = new Node(val);

        //B2. Noi tail cua newNode vao dau cua head
        newNode.next = head; 

        //B3. Chuyen con tro head vao Node dau:
        head = newNode;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        //b1. tao node moi
        Node newNode = new Node(val);

        //B2. Tao node last
        if (head ==null) {
            //B2. list rong
            head = newNode;
        } else {
            Node lastNode =head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            //b3. Noi tail voi newNode
            lastNode.next = newNode;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
        } else {
            //B1. tao node moi
            Node newNode = new Node(val); 
            //B2: tim den index-1
            if(head ==null) {
                if (index == 0) {
                    head = newNode;
                }
            } else {
                int curIndex = 0;
                Node tempt = head; 

                while (tempt!= null) {
                    curIndex++;
                    
                    if (curIndex == index-1) {

                        //tempt = index-1 
                        newNode.next = tempt.next;
                        tempt.next = newNode;
                        break;
                    }

                    tempt = tempt.next;
                }
            }
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        if (index ==0) {
            //xoa o dau
            head = head.next;
        } else {
            // B1 Di tim node index-1
            Node temp = head;
            int curIndex = -1;

            while(temp != null) {
                curIndex++;

                if(curIndex == index -1) {
                    Node delNode = temp.next;
                    if(delNode == null ) {
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

    public void show() {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head; 
            // Co dau bang la bat dau tro vao (o day la head)

            while(temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }

        }
    }


    public static void printLinkedList(Node head) {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head; 
            // Co dau bang la bat dau tro vao (o day la head)

            while(temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }

        }
    }

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        // Node n1 = new Node(1);
        // Node n2 = new Node(2);
        // Node n3 = new Node(3);

        // n1.next = n2;
        // n2.next = n3;

        // printLinkedList(n1);

        // myList.addAtHead(1);
        // myList.addAtHead(4);
        // myList.addAtHead(10);
        
        myList.addAtTail(2);
        myList.addAtTail(4);
        myList.addAtTail(6);

        myList.addAtIndex(0,1);
        myList.addAtIndex(0,2);
        myList.addAtIndex(0,3);

        myList.deleteAtIndex(0);
        myList.show();
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

