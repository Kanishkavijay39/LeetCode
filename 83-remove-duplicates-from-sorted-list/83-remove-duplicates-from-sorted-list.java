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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode curr=head,forw=head.next;
        while(forw!=null){
            if(curr.val==forw.val){
                forw=forw.next;
            }
            else{
                curr.next=forw;
                curr=forw;
                forw=forw.next;
            }
        }
        curr.next=null;
        return head;
    }
}