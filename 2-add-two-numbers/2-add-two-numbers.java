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
        int len1=len(l1);
        int len2=len(l2);
     
        
       if(len1>len2)
        {
            int diff=len1-len2;
            append(l2,diff);
            
            
        }
        else if(len2>len1)
        {
            int diff=len2-len1;
           append(l1,diff);
            
           
            
       }
        
        ListNode rl1=reverse(reverse(l1));
        ListNode rl2=reverse(reverse(l2));
       
        ListNode add= new ListNode(0);
        ListNode o=add;
        int sum=0;
        int carry=0;
        
        //print(rl1);
        //print(rl2);
          
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
    
    public int len(ListNode l)
    {  ListNode t=l;
        int count=0;
        while(t!=null)
        {
            count++;
            t=t.next;
           
        }
     return count;
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
   public void append(ListNode l,int diff)
   {
       ListNode t=l;
             while(t.next!=null)
          {
           t=t.next;
            }
            while(diff>0)
            {
              t.next=new ListNode(0);
            t=t.next;
                diff--;
           }
        
    }
    public void print(ListNode head)
    {
        ListNode h=head;
        while(h!=null)
        {
            System.out.print(h.val);
            h=h.next;
        }
        System.out.println(" ");
    }
}