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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        // this would be result;
        List<List<Integer>> ls= new ArrayList<>();
        
        if(root==null)return ls;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> l= new ArrayList<>();
        int level=0;
        
        while(!q.isEmpty())
        {
            TreeNode t= q.remove();
            if(t!=null)
            {
                l.add(t.val);
            
                    if(t.left!=null)
                        q.add(t.left);
                    if(t.right!=null)
                    q.add(t.right);
              
            }
            else if(!q.isEmpty())
            {
                q.add(null);
                level++;
                ls.add(l);
                l=new ArrayList<>();
            }
        }
        ls.add(l);
       
        
        for(int i=0;i<ls.size();i++)
        {
            if(i%2!=0)
            {
                Collections.reverse(ls.get(i));
            }
        }
         return ls;
    }
}