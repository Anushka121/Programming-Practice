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
    
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head==null||head.next==null)return head;
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        
        ListNode forward = head,pre = temp;
        
        boolean flag = true;
        
        while(forward!=null && forward.next!=null)
        {
            if(forward.next.val == forward.val)
            {
                pre.next = forward.next.next;
                forward = forward.next;
                flag = false;
            }else{
                if(flag) pre = pre.next;
                forward = forward.next;
                flag = true;
            }
        }
        return temp.next;
}
    }
