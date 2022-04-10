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
    
    public List<Integer> rightSideView(TreeNode root) 
    {
        ArrayList<Integer> al= new ArrayList<>();
        rightView(root,al,0);
        return al;
    }
    public void rightView(TreeNode root,List<Integer> al,int level)
    {
        if(root==null)return;
        if(level==al.size())
        {
            al.add(root.val);
            
        }
        rightView(root.right,al,level+1);
        rightView(root.left,al,level+1);
    }
}