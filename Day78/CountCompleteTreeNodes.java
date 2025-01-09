/**
 * Definition for a binary tree node.
 */
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) 
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class CountCompleteTreeNodes 
{
    public int countNodes(TreeNode root) 
    {
        if (root == null) 
        {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (leftHeight == rightHeight) 
        {
            return (1 << leftHeight) + countNodes(root.right);
        } 
        else 
        {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }

    private int getHeight(TreeNode node) 
    {
        int height = 0;
        while (node != null) 
        {
            height++;
            node = node.left;
        }
        return height;
    }

    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(1, 
                new TreeNode(2, 
                        new TreeNode(4), 
                        new TreeNode(5)), 
                new TreeNode(3, 
                        new TreeNode(6), 
                        null));

        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();
        int result = solution.countNodes(root);
        System.out.println("Total number of nodes in the tree: " + result);
    }
}
