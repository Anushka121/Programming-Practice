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
       if(l2==null)return l1;
       
        ListNode rl1=l1;
        ListNode rl2=l2;
       
        ListNode add= new ListNode(0);
        ListNode o=add;
        int sum=0;
        int carry=0;
          
        while(rl1!=null&&rl2!=null)
        {
             sum=rl1.val+rl2.val+carry;
           // System.out.print(sum);
             carry=sum/10;
            // System.out.print("carry"+carry);
             o.next=new ListNode(sum%10);
                o=o.next;
                rl1=rl1.next;
                rl2=rl2.next;
            
        }
          while(rl1!=null)
          {
              sum=rl1.val+carry;
              carry=sum/10;
              o.next=new ListNode(sum%10);
              o=o.next;
              rl1=rl1.next;
          }
        
          while(rl2!=null)
          {
              sum=rl2.val+carry;
              carry=sum/10;
              o.next=new ListNode(sum%10);
              o=o.next;
              rl2=rl2.next;
          }

           if(carry!=0)
               o.next=new ListNode(carry);
            return add.next;
        
    }
    
   

    public ListNode reverse(ListNode head)
    {
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

}