/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,curr=null;
        if(head.next==null){
            head=null;
            return head;
        }
        // 1 2 3
        while(n!=0){
            fast=fast.next;
            n--;
        }
        while(fast!=null){
            if(curr == null)
                curr = head;
            else 
                curr=curr.next;
            fast=fast.next;
        }
        if(curr == null){
            head = head.next;
        }
        else 
            curr.next=curr.next.next;
        
        return head;
    }
}