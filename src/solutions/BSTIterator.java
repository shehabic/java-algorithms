package solutions;

import java.util.Deque;
import java.util.LinkedList;

public class BSTIterator {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    private Deque<TreeNode> stack = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        addLeftMost(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode curr = stack.pop();
        addLeftMost(curr.right);
        return curr.val;
    }

    private void addLeftMost(TreeNode node) {
        while (node != null) {
            stack.add(node);
            node = node.left;
        }
    }
}
