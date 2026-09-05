public class Solution {
    public boolean hasCycle(ListNode head) {
      ListNode fast=head;
      ListNode slow=head;
      while(fast!=null && fast.next!=null)
      {
        if (slow==fast.next)
        {
            return true;
        }
        fast=fast.next.next;
        slow=slow.next;
      }
      return false;  
    }
}