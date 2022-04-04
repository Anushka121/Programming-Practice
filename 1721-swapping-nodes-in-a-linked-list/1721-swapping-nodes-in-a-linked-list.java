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
    public ListNode swapNodes(ListNode head, int k) 
    {
       int count=0;
       ListNode h=head;
       ListNode temp1=null;
       ListNode temp2=null;
        
        //get total count
        while(h!=null)
        {
            count++;
            h=h.next;
        }
        
        //traverse again
            h=head;
            int i=0;
         while(h!=null)
         {
                i++;
                //from start
                if(i==k)
                {
                 temp1=h;   
                }
               //total -k += kth position from end
                if(count-k+1==i)
                {
                    temp2=h;
                }
                h=h.next;     
         }
        
        //swap
        int val=temp1.val;
        temp1.val=temp2.val;
        temp2.val=val;
        
       return head;
    }
}