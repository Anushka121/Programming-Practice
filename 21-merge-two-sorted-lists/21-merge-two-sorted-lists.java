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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1==null)return list2;
        if(list2==null)return list1;
        
        ListNode merge=null;
        ListNode prev=null;
        
        
        ListNode l1=list1;
        ListNode l2=list2;
        
         while(l1!=null&&l2!=null)
         {
             if(l1.val<=l2.val)
             {
                if(merge==null)
                {
                    merge=new ListNode(l1.val);
                    prev=merge;
                }
                 
                 else
                 {
                     prev.next= new ListNode(l1.val);
                     prev=prev.next;
                     
                 }
                 l1=l1.next;
                 
             }
             else
             {
                 if(merge==null)
                {
                    merge=new ListNode(l2.val);
                    prev=merge;
                }
                 
                 else
                 {
                     prev.next= new ListNode(l2.val);
                     prev=prev.next;
                     
                 }
                 l2=l2.next;
                 
             }
            
             
         }
        
        if(l1!=null)prev.next=l1;
        else if (l2!=null)prev.next=l2;
        return merge;
    }
        
}