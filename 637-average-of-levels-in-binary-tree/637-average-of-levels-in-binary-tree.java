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
    public List<Double> averageOfLevels(TreeNode root)
    {
        Queue<TreeNode> q= new LinkedList<>();
        List<Double> result= new ArrayList<>();
        q.add(root);
        q.add(null);
         double count=0;
         double sum=0;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node!=null){
                count++;
                sum+=node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                
            }
            else if(!q.isEmpty()){
                result.add(new Double(sum/count));
                sum=0;
                count=0;
                q.add(null);
            }
        }
        
         result.add(new Double(sum/count));
        return result;
        
    }
}