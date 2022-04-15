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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root)
    {
        diaBinaryTree(root);
         return max;
    }
        
    public int diaBinaryTree(TreeNode root)
    {
        if(root==null) return 0;
        
        int left=diaBinaryTree(root.left);
        int right=diaBinaryTree(root.right);
        
          if(max<(left+right))
            max=left+right;
        
        return 1+Math.max(left,right);
    }
    
    
    
}