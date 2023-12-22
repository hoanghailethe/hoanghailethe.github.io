class MyLinkedList {
    //IMPLEMENT LẠI LINKEDLIST
    public class Node {
        public int value;
        Node next;
        public Node(int val){
            this.value = val;
        }
    }

    Node head;

    public MyLinkedList() {
        
    }
    
   
    public int get(int index) {
        
        return -1;
    }
    
   
    public void addAtHead(int val) {
        //B1: Tạo node
        Node newNode = new Node(val);
        //B2: Nối đít của newnode vào đầu của head
        newNode.next = head;
        //B3: Gắn con trỏ head vào newnode
        head = newNode;

    }
    
    
    public void addAtTail(int val) {
        //B1: tạo node
        Node newNode = new Node(val);
        //B2: Tìm node last
        if (head == null){
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        //B3: trỏ Last vào newNode
        
    }
    
    
    public void addAtIndex(int index, int val) {
        //B1: Tạo node mới
        
        //b2: Tìm đến index - 1 (index trc vị trí mình muốn chèn)
        
        if (index == 0) {
            addAtHead(val);
        } else {
            Node newNode = new Node(val);
            int currentIndex = -1;
            Node temp = head;
            while (temp != null) {
                currentIndex++;
                if (currentIndex == index - 1) {
                    //temp => index-1
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
        if (index == 0) {//xóa ở đầu
            head = head.next;
        } else {
            //B1: Đi tìm node index-1
            Node temp = head;
            int currentIndex = -1;

            while (temp != null) {
                currentIndex++;

                if (currentIndex == index - 1) {
                    Node del = temp.next;
                    if (del == null) {
                        return;
                    } else {
                        temp.next = del.next;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void show() {
        printLinkedlist(head);
    }

    public static void printLinkedlist(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.addAtIndex(0, 1);
        myList.addAtIndex(0, 2);
        myList.addAtIndex(0, 3);

        myList.deleteAtIndex(0);
        myList.show();
    }
}

