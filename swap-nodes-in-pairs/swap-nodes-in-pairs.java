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
    public ListNode swapPairs(ListNode head) {
        
        helper(head);
        return head;
        
        
    }
    public void  helper(ListNode head){
        if(head==null||head.next==null)
            return;
    
        int temp=head.val;
        head.val=head.next.val;
        head.next.val=temp;
        
       helper(head.next.next);
    }
}