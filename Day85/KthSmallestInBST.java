class KthSmallestInBST 
{
    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k)
    {
        inOrderTraversal(root, k);
        return result;
    }

    private void inOrderTraversal(TreeNode node, int k) 
    {
        if (node == null) 
        {
            return;
        }

        inOrderTraversal(node.left, k);

        count++;
        if (count == k) 
        {
            result = node.val;
            return;
        }

        // Visit the right subtree
        inOrderTraversal(node.right, k);
    }

    public static void main(String[] args) 
    {
        // Example Tree: [5,3,6,2,4,null,null,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        KthSmallestInBST solution = new KthSmallestInBST();
        int k = 3;
        System.out.println("Kth smallest element: " + solution.kthSmallest(root, k)); // Output: 3
    }
}

class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) 
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
