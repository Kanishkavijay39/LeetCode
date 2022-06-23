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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dnode=new ListNode(2);
        ListNode tail=dnode,odd=head,even=head.next;
        while(odd!=null && even!=null){
            ListNode temp=even.next;
            tail.next=even;
            tail=tail.next;
            tail.next=odd;
            tail=tail.next;
            odd=temp;
            if(odd!=null){
                even=temp.next;
            }
            
        }
        if(odd==null){
            tail.next=null;
        }
        else{
            tail.next=odd;
        }
        return dnode.next;
    }
}