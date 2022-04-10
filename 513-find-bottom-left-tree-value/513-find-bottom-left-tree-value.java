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
    int val=0;
    public int findBottomLeftValue(TreeNode root)
    {  ArrayList<Integer> al= new ArrayList<>();
         findBottom( root,0,al);
        return al.get(al.size()-1);
        
    }
    public void findBottom(TreeNode root,int level,ArrayList<Integer> al)
    {
        if(root==null)return ;
        if(level==al.size())
        {
            al.add(root.val);
        }
        
        findBottom( root.left,level+1,al);
        findBottom( root.right,level+1,al);
        
        }
}