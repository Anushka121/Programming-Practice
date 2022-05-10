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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        
        if(l1==null)return l2;
        else if(l2==null) return l1;
        
        ListNode ll1=l1;
        ListNode ll2=l2;
        
        ListNode result=null;
        ListNode prev=null;
        int carry=0;
        while(ll1!=null &&ll2!=null)
        {
            int sum=ll1.val+ll2.val+carry;
            carry=sum/10;
            if(result==null)
            {
                result= new ListNode(sum%10);
                prev=result;
            }
            else
            {
                prev.next=new ListNode(sum%10);
                prev=prev.next;
            }
            ll1=ll1.next;
            ll2=ll2.next;
        }
        while(ll1!=null)
        {
            int sum=ll1.val+carry;
            carry=sum/10; 
            prev.next=new ListNode(sum%10);
            prev=prev.next;
            ll1=ll1.next;
        }
        while(ll2!=null)
        {
            int sum=ll2.val+carry;
            carry=sum/10; 
            prev.next=new ListNode(sum%10);
            prev=prev.next;
            ll2=ll2.next;
        }
        if(carry!=0)
        {
            prev.next=new ListNode(carry);
            prev=prev.next;
        }
        return result;
    }
}