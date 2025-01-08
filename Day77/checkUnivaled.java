class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class checkUnivaled 
{
    public boolean isUnivalTree(TreeNode root) 
    {
        if (root == null) 
        {
            return true;
        }

        int value = root.val;
        return checkUnival(root, value);
    }

    private boolean checkUnival(TreeNode node, int value) 
    {
        if (node == null) 
        {
            return true;
        }
        if (node.val != value) 
        {
            return false;
        }
        return checkUnival(node.left, value) && checkUnival(node.right, value);
    }

    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        checkUnivaled solution = new checkUnivaled();
        boolean result = solution.isUnivalTree(root);

        System.out.println("Is the tree univalued? " + result);
    }
}
