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
   
    public ListNode sortList(ListNode head) 
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        
        ListNode middle=getMiddle(head);
        ListNode nextOfMiddle=middle.next;
        middle.next=null;
        
        ListNode left=sortList(head);
        ListNode right=sortList(nextOfMiddle);
        
        ListNode merged=mergeList(left,right);
        return merged;
    }
    public ListNode getMiddle(ListNode head)
    {
       ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
    }
    public ListNode mergeList(ListNode left,ListNode right)
    {    
        if(left==null)return right;
        else if(right==null)return left;
        
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        
        while(left != null && right != null)
        {
            if(left.val <= right.val)
            {
                dummy.next = left;
                dummy = left;
               left=left.next;
            }
            else 
            {
                dummy.next = right;
                dummy = right;
               right=right.next;
            }
        }
        dummy.next=(left==null)?right:left;
        return res.next;
    }
}