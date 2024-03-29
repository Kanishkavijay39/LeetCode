// { Driver Code Starts
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            System.out.println( x.countNodesinLoop(head) );
        }
    }
}
// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
         Node st = cycleHead(head);
        if(st==null) return 0;
        int count = 1;
        Node temp = st;
        while(temp.next != st){
            temp = temp.next;
            count++;
        }
        return count;
    }
    static Node cycleHead(Node head){
      if(head==null || head.next==null) return null;
       Node slow = head;
       Node fast = head;
       Node curr = head;
     
        while(fast.next != null && fast.next.next!= null){
          
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){    //cycle present
                while(curr != slow){   //cycle head
                    curr = curr.next;
                    slow = slow.next;
                }
                return curr;
            }
        } 
        
        return null;
    }

}