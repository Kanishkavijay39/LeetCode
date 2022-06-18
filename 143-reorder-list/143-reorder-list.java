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
    public ListNode middle(ListNode head){
        
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null, curr=head;
        while(curr!=null){
            ListNode nbr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nbr;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode mid=middle(head);
        // ListNode head2=new ListNode(0);
        ListNode head2=mid.next;
        mid.next=null;
        head2 = reverse(head2);
        ListNode dummy=new ListNode();
        ListNode curr=dummy,p1=head,p2=head2;
        while(p1!=null && p2!=null){
            curr.next=p1;
            curr=curr.next;
            p1=p1.next;
            
            curr.next=p2;
            curr=curr.next;
            p2=p2.next;
        }
        if(p1!=null){
            curr.next=p1;
        }
        //ab run krke de
      }
}
