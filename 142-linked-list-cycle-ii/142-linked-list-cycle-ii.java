/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return slow;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode isCyclic=hasCycle(head);
        if(isCyclic==null) return null;
        ListNode slow=isCyclic,fast=head;
        while(true){
            if(slow==fast) return slow;
            fast=fast.next;
            slow=slow.next;
        }
        
    }
}