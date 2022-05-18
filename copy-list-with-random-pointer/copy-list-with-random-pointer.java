/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head)
    {
        //LinkedHashMap<Node, Node> hn= new LinkedHashMap<>();
        Node p= head;  
        if(head==null)return head;
        while(p!=null)
        {
            Node n= new Node(p.val);
            n.next=p.next;
            p.next=n;
            p=p.next.next;
        }
       
        //
        p=head;
        while(p!=null)
        {
            if(p.random!=null)
            {
                p.next.random=p.random.next;
                
            }
            p=p.next.next;
        }
        
        //segreate
        p=head;
        Node c=head.next;
        Node r=head.next;
        while(p!=null)
        {
            p.next=p.next.next;
            if(c.next!=null)
            {
                c.next=c.next.next;
            }
            p=p.next;
            c=c.next;
        }
        return r;
//         Node node = head;
//        while (node != null) {
//         hn.get(node).next = hn.get(node.next);
//         hn.get(node).random = hn.get(node.random);
//         node = node.next;
//       }
  
//   return hn.get(head);
}
}