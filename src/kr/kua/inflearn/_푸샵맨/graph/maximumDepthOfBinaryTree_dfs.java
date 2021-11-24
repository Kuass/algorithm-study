package kr.kua.inflearn._푸샵맨.graph;

import java.util.Stack;

public class maximumDepthOfBinaryTree_dfs {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.left.left = new TreeNode(6);

        System.out.print("val : " + dfs(node));
    }

    static int dfs(TreeNode root) {
        if (root == null) return 0;

        Stack<TreeNode> treeStack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();

        treeStack.push(root);
        valueStack.push(1);

        int max = 0;
        while (!treeStack.isEmpty()) {
            TreeNode node = treeStack.pop();
            int count = valueStack.pop();
            max = Math.max(max, count);

            if (node.left != null) {
                treeStack.push(node.left);
                valueStack.push(count + 1);
            }
            if (node.right != null) {
                treeStack.push(node.right);
                valueStack.push(count + 1);
            }
        }

        return max;
    }
}
