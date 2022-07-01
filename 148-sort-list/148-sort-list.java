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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=midNode(head);
        ListNode nhead=mid.next;
        mid.next=null;
        ListNode L1=sortList(head);
        ListNode L2=sortList(nhead);
        return mergeTwoSortedLL(L1,L2);
    }
    //merge2 sortedll
    public ListNode mergeTwoSortedLL(ListNode list1,ListNode list2){
        //base
        if(list1==null || list2==null){
            return (list1!=null)?list1:list2;
        }
        //pointers p1,p2
        ListNode c1=list1,c2=list2;
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                tail.next=c1;
                c1=c1.next;
            }
            else{
                tail.next=c2;
                c2=c2.next;
            }
            tail=tail.next;
        }
        tail.next=(c1!=null)?c1:c2;
        return dummy.next;
    }
    
    
    
    //midnode for breaking
    public ListNode midNode(ListNode node){
        if(node==null || node.next==null) return node;
        ListNode fast=node,slow=node;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}