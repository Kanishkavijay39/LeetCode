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
    //oh,ot.... th,tt.. curr,frw
    //length findout of ll
    public int length(ListNode node){
        ListNode curr=node;
        int len=0;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
      return len;  
    }
    //addFirst
    ListNode th=null;
    ListNode tt=null;
    public void addFirst(ListNode node){
       if(th==null){
           th=tt=node;
       }
        else{
            node.next=th;
            th=node;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
            if(head==null || head.next==null || k==0){
                return head;
            }
        ListNode oh=null;
        ListNode ot=null;
        int len=length(head);
        ListNode curr=head;
        while(len>=k){
            int tempk=k;
            while(tempk>0){
                ListNode frw=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=frw;
                tempk--;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            }else{
                ot.next=th;
                ot=tt;
            }
            th=tt=null;
            len-=k;
        }
        ot.next=curr;
        return oh;
    }
    
    
}