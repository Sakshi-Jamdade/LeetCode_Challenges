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
class RightSideViewCode 
{
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> rightSide = new ArrayList<>();
        
        if (root == null) 
        {
            return rightSide; 
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) 
        {
            int levelSize = queue.size(); 
            
            for (int i = 0; i < levelSize; i++) 
            {
                TreeNode currentNode = queue.poll(); 
                
                // If it's the last node in this level, add its value to the result
                if (i == levelSize - 1) 
                {
                    rightSide.add(currentNode.val);
                }
                
                // Add left and right children to the queue
                if (currentNode.left != null) 
                {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) 
                {
                    queue.add(currentNode.right);
                }
            }
        }
        
        return rightSide; 
    }
}