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
        /*if(head==null || head.next==null) return head;
        ListNode dnode=new ListNode(0);
        ListNode curr=head,tail=dnode;
        tail.next=head;
        boolean flag=false;
        while(curr.next!=null){
            if(curr.val==curr.next.val){
                curr=curr.next;
            }
            else{
                if(tail.next==curr){
                    tail.next=curr;
                    tail=tail.next;
                }
                else{
                    tail.next=curr.next;
                    curr=curr.next;
                }
            }
        }
    //if(tail.next==head && head.val==head.next.val) tail.next=null;
    return dnode.next;    */
        
        
        if(head==null || head.next==null) return head;  
        ListNode dummy = new ListNode(0 == head.val? 1: 0, head);  
        
        ListNode curr=head, prev=dummy, temp=dummy;  
        
        while(curr.next != null){
            if(temp.val != curr.val && curr.val != curr.next.val){
                prev.next=curr;
                prev=curr;
            }
            temp=curr;
            curr=curr.next;
        }
        if(temp.val != curr.val) prev.next=curr;   
        else prev.next=null;
        return dummy.next;
       
    }
}