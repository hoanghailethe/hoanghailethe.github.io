
  //Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// public class _141LinkedListCycle {
//     public static boolean hasCycle(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void show(ListNode lx) {
//         if (lx == null) {
//             System.out.println("List is empty");
//         } else {
//             ListNode temp = lx;
//             while (temp != null) {
//                 System.out.print(temp.val);
//                 temp = temp.next;
//                 if (temp != null){
//                     System.out.print("->");
//                 } else {
//                     System.out.println();
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         ListNode l1 = new ListNode(3);
//         l1.next = new ListNode(2);
//         l1.next.next = new ListNode(0);
//         l1.next.next.next = new ListNode(-4);

//         show(l1);
        
//         System.out.println(hasCycle(l1));

//     }
// }
public class _141LinkedListCycle {//Chữa bài
    public static boolean hasCycle(ListNode head) {

    }
    
}