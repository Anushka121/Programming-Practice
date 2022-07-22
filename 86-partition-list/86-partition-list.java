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
    public ListNode partition(ListNode head, int x)
    {
        if(head==null||head.next==null){
            return head;
        }
        else
        {
            ListNode before=new ListNode(0);
            ListNode after=new ListNode(0);
            ListNode b=before;
            ListNode a=after;
            ListNode start=head;
            ListNode t=head;
            // int xi=0;
            // int c=0;
            // while(t!=null){
            //     if(c==x){
            //         xi=t.val;
            //         break;
            //     }
            //     c++;
            //     t=t.next;
            // }
            // System.out.println(xi);
            
            while(start!=null)
            {
                if(start.val<x)
                {
                  
                       b.next= new ListNode(start.val);
                       b=b.next;
                   }
                else 
                {
                   
                    
                        a.next=new ListNode(start.val);
                        a=a.next;
                    
                }
             
                start=start.next;
            }   
            
             // b.next= new ListNode(x);
             // b=b.next;
             b.next=after.next;
            
            return before.next ;
            
        }
    }
}