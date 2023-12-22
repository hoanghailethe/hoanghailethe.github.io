public class BaiCuaDo {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode runner = head;
        while (runner.next != null) {

            ListNode target = runner.next;
            // Tao thanh 1 vong trong tai chinh no
            if(target == runner){
                return true;
            }
            // Cho folower chay tu head -> runner
            ListNode follower = head;
            while (follower != runner) {
                
                if(follower == target)
                    return true;
               
                
                follower = follower.next;
            }

            runner = runner.next;
        }

        return false;
    }
}
