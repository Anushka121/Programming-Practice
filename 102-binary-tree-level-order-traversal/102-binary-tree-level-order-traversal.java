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
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        q.add(null);
        while(q.isEmpty()!=true){
            TreeNode n=q.poll();
            if(n!=null){
                l.add(n.val);
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
            else if(q.isEmpty()!=true){
                ans.add(l);
                l= new ArrayList<>();
                q.add(null);
            }
        }
        ans.add(l);
        return ans;
    }
}