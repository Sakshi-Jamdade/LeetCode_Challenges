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
class MergeTreesCode 
{
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        
        // Merge the values of the two nodes
        root1.val += root2.val;
        
        // merge the left and right children
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        
        return root1;
    }
}