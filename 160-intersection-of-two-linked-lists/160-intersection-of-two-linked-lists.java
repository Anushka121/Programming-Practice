/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode c1=headA;
        ListNode c2=headB;
        int countc1=0,countc2=0;
        while(c1!=null){
            countc1++;
            c1=c1.next;
        }
        while(c2!=null){
            countc2++;
            c2=c2.next;
        }
        int diff=Math.abs(countc1-countc2);
        c1=headA;
        c2=headB;
       
        if(countc1>countc2){
            while(diff-->=1)
                c1=c1.next;
        }
        else if(countc2>countc1){
            while(diff-- >=1)
                c2=c2.next;
        }
        while(c1!=null && c2!=null){
            if(c1==c2)
                return c1;
            c1=c1.next;
            c2=c2.next;
        }
        return null;
    }

}