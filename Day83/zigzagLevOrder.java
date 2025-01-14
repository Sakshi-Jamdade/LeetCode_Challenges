class zigzagLevOrder 
{
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
  {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean leftToRight = true;

    while (!queue.isEmpty()) 
    {
        List<Integer> level = new LinkedList<>();
        for (int i = queue.size(); i > 0; i--) 
        {
            TreeNode node = queue.poll();
            if (leftToRight) 
            level.add(node.val);
            else 
            level.add(0, node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        result.add(level);
        leftToRight = !leftToRight;
    }
    return result;
  }
}
