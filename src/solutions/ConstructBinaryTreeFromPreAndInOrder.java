package solutions;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreAndInOrder {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Map<Integer, Integer> inOrdMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) inOrdMap.put(inorder[i], i);
        return buildTree(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preIdx, int inStart, int inEnd) {
        if (preIdx >= preorder.length || inStart > inEnd) return null;
        int val = preorder[preIdx];
        int inIdx = inOrdMap.get(val);
        TreeNode node = new TreeNode(val);
        node.left = buildTree(preorder, inorder, preIdx + 1, inStart, inIdx - 1);
        node.right = buildTree(preorder, inorder, preIdx + 1 + inIdx - inStart, inIdx + 1, inEnd);

        return node;
    }
}
