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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head ,  fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null , curr = head;

        while(curr != null){
            ListNode nbr = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nbr;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode head2 = mid.next;
        mid.next = null;

        head2 = reverseList(head2);

        ListNode left = head , right = head2;
        boolean ans = true;
        while(right != null){
            if(left.val == right.val){
                left = left.next;
                right = right.next;
            }else{
                ans = false;
                break;
            }
        }

        head2 = reverseList(head2);
        mid.next = head2;

        return ans;
    }
}