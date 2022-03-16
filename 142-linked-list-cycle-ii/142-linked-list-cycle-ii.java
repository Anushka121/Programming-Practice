/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head)
    {  if(head==null) return head;
        HashSet<ListNode> list= new HashSet<>();
        ListNode t=head;
        while(t!=null)
        {  

             if(list.contains(t))return t;
             list.add(t);
             t=t.next;
        }
        return t;
    }
}