/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root)
    {
     
        ArrayList<Integer> l= new ArrayList<>();
        if(root==null)return l;
        
       TreeNode t=root;
        
     Stack<TreeNode> st= new Stack<>();
     while(t!=null||!st.isEmpty())
     {
         while(t!=null)
         {
             st.add(t);
             t=t.left;
         }
         t=st.pop();
         l.add(t.val);
         t=t.right;  
     }
        
       return l;
    }
}