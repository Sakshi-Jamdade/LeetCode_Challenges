import java.util.*;

class BinaryTreeLevelOrder 
{
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) 
        {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) 
        {
            List<Integer> level = new ArrayList<>();

            for (int i = queue.size(); i > 0; i--) 
            {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            ans.add(level);
        }

        return ans;
    }

    public static void main(String[] args) 
    {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Test the levelOrder method
        BinaryTreeLevelOrder solution = new BinaryTreeLevelOrder();
        List<List<Integer>> result = solution.levelOrder(root);

        // Print the result
        System.out.println(result);
    }
}

// Definition for a binary tree node
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
