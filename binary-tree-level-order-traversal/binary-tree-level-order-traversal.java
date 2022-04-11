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
    public List<List<Integer>> levelOrder(TreeNode root)
    {
       
        List<List<Integer>> lv= new ArrayList<>();
        if(root==null)return lv;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=0;
          ArrayList<Integer> l= new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode t= q.remove();
          
            if(t!=null)
            {
                 l.add(t.val);
                //System.out.println(t.val);
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
                
            }
            
            else if(!q.isEmpty())
            {
                q.add(null);
                lv.add(l);
                l= new ArrayList<>();
            }
            
            
        }
        lv.add(l);
        return lv;
        
    }
}