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
class BalancedBSTCode 
{
    public TreeNode balanceBST(TreeNode root) 
    {
        List<Integer> sortedValues = new ArrayList<>();
        inOrderTraversal(root, sortedValues);
        return buildBalancedBST(sortedValues, 0, sortedValues.size() - 1);
    }

    private void inOrderTraversal(TreeNode node, List<Integer> sortedValues) 
    {
        if (node != null) 
        {
            inOrderTraversal(node.left, sortedValues);
            sortedValues.add(node.val);
            inOrderTraversal(node.right, sortedValues);
        }
    }

    private TreeNode buildBalancedBST(List<Integer> values, int start, int end) 
    {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(values.get(mid));
        
        node.left = buildBalancedBST(values, start, mid - 1);
        node.right = buildBalancedBST(values, mid + 1, end);

        return node;
    }
}