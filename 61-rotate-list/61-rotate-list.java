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
    /*public ListNode reverse(ListNode head){
        ListNode tail=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nbr=curr.next;
            curr.next=tail;
            tail=curr;
            curr=nbr;
        }
        return tail;
    }*/
    public ListNode rotateRight(ListNode head, int k) {
    
       /* ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        k=k%size;
        int i=0;
        ListNode head2=head;
        ListNode prev=null;
        while(i<4){
            prev=head2;
            head2=head2.next;
        }
        prev.next=null;
        reverse(head);
        reverse(head2);
        
        
        
        return head;
        */
    if(head == null || k == 0) {
        return head;
    }
    ListNode p = head;
    int len = 1;
    while(p.next != null) {
        p = p.next;
        len++;
    }
    p.next = head;
    k %= len;
    for(int i = 0; i < len - k; i++) {
        p = p.next;
    }
    head = p.next;
    p.next = null;
    return head;
        
    }
}