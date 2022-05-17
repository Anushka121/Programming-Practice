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
        LinkedHashMap<Node, Node> hn= new LinkedHashMap<>();
        Node p= head;
        //to store in the map
        while(p!=null)
        {
            hn.put(p, new Node(p.val));
            p=p.next;
        }
       
        Node node = head;
       while (node != null) {
        hn.get(node).next = hn.get(node.next);
        hn.get(node).random = hn.get(node.random);
        node = node.next;
      }
  
  return hn.get(head);
}
}