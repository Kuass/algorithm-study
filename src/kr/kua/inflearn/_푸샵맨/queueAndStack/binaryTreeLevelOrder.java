package kr.kua.inflearn._푸샵맨.queueAndStack;

import kr.kua.inflearn._푸샵맨.graph.TreeNode;

import java.util.*;

public class binaryTreeLevelOrder {
    // BFS 의 어머니
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        binaryTreeLevelOrder a = new binaryTreeLevelOrder();
        System.out.println(a.solve(root));
    }

    public List<List<Integer>> solve(TreeNode root) {
        // 1. ds
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // 2. for, while add algo
        while(!queue.isEmpty()) {
            int size = queue.size(); // 1
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val); // 1
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(list);
        }

        return result;
    }
}
