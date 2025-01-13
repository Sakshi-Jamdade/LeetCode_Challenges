import java.util.ArrayList;
import java.util.List;

class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) 
    {
        val = x;
    }
}

public class BinaryTreePathFinder 
{
    private void allPaths(TreeNode root, String psf, List<String> paths) 
    {
        // Base case: if the node is a leaf
        if (root.left == null && root.right == null) 
        {
            paths.add(psf + root.val);
            return;
        }
        
        // Recursive case: traverse left subtree
        if (root.left != null) 
        {
            allPaths(root.left, psf + root.val + "->", paths);
        }
        
        // Recursive case: traverse right subtree
        if (root.right != null) 
        {
            allPaths(root.right, psf + root.val + "->", paths);
        }
    }

    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;                   // Handle empty tree
        allPaths(root, "", ans);                        // Start the recursive path finding
        return ans;                                     // Return all found paths
    }

    public static void main(String[] args) 
    {
        BinaryTreePathFinder btpFinder = new BinaryTreePathFinder();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> paths = btpFinder.binaryTreePaths(root);
        
        // Outputting the paths
        System.out.println("Root-to-leaf paths:");
        for (String path : paths) 
        {
            System.out.println(path);
        }
    }
}
