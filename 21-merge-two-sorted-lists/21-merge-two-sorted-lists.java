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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1=list1,ptr2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(ptr1!=null || ptr2!=null){
            int v1=(ptr1!=null)?ptr1.val:Integer.MAX_VALUE;
            int v2=(ptr2!=null)?ptr2.val:Integer.MAX_VALUE;
            if(v1<=v2){
                tail.next=ptr1;
                ptr1=ptr1.next;
            }else{
                tail.next=ptr2;
                ptr2=ptr2.next;
            }
            tail=tail.next;
        }
        return dummy.next;
    }
}