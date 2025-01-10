import java.util.*;

// Definition for a binary tree node.
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SymmetricTreeCheck 
{
    public boolean helper(TreeNode root1, TreeNode root2) 
    {
        if (root1 == null || root2 == null) 
        {
            return root1 == root2;
        }
        if (root1.val == root2.val) 
        {
            boolean ans1 = helper(root1.left, root2.right);
            boolean ans2 = helper(root1.right, root2.left);
            return ans1 && ans2;
        } 
        else 
        {
            return false;
        }
    }

    public boolean isSymmetric(TreeNode root) 
    {
        if (root == null) 
        {
            return true;
        }
        return helper(root.left, root.right);
    }

    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        SymmetricTreeCheck checker = new SymmetricTreeCheck();

        boolean result = checker.isSymmetric(root);

        System.out.println("Is the tree symmetric? " + result);
    }
}
