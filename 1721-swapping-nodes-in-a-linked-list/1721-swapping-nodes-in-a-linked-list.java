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
        if(head==null)return head;
        int count=0;
       ListNode h=head;
       ListNode temp1=null;
       ListNode temp2=null;
        while(h!=null)
        {
            count++;
             temp2=h;
            
            h=h.next;
        }
        h=head;
        int i=0;
         while(h!=null)
         {
                i++;
                if(i==k)
                {
                 temp1=h;   
                }
                if(count-k+1==i)
                {
                    temp2=h;
                }
                h=h.next;     
         }
        int val=temp1.val;
        temp1.val=temp2.val;
        temp2.val=val;
       return head;
    }
}