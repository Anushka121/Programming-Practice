/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findLCA(root,p,q);
    }
    public TreeNode findLCA(TreeNode root, TreeNode first, TreeNode second){
    if(root == null || first == root || second == root)
        return root;
    
    TreeNode left = findLCA(root.left, first, second);
    TreeNode right = findLCA(root.right, first, second);
    
    if(left == null)
        return right;
    else if(right == null)
        return left;
    
    return root;
}
}