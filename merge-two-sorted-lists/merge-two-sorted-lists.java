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
         if(list2==null) return list1;
        
         ListNode result=null;
         ListNode prev=null;
        
         ListNode pt1=list1;
         ListNode pt2=list2;
        
        while(pt1!=null&&pt2!=null){
            if(pt1.val<pt2.val){
                if(result==null){
                    result=new ListNode(pt1.val);
                    prev=result;
                }
                else{
                    prev.next=new ListNode(pt1.val);
                    prev=prev.next;
                }
                
                pt1=pt1.next;
            }
            else{
                if(result==null){
                    result=new ListNode(pt2.val);
                    prev=result;
                }
                else
                {
                    prev.next=new ListNode(pt2.val);
                    prev=prev.next;
                }
                
                pt2=pt2.next;
            }
        }
        if(pt1!=null)prev.next=pt1;
        else if(pt2!=null)prev.next=pt2;
        return result;
    }
}