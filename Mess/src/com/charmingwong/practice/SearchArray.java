package com.charmingwong.practice;

/**
 * Created by CharmingWong on 2017/3/27.
 */
public class SearchArray {

    /**
     *
     */
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(6);
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(16);
        Convert(root);
    }

    public static TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        TreeNode head = pRootOfTree;
        if (pRootOfTree.left != null) {
            TreeNode lNode = traversal(pRootOfTree.left);
            lNode.right = pRootOfTree;
            pRootOfTree.left = lNode;
            while (lNode.left != null)
                lNode = lNode.left;
            head = lNode;
        }

        if (pRootOfTree.right != null) {
            TreeNode rNode = traversal(pRootOfTree.right);
            while (rNode.left != null)
                rNode = rNode.left;
            rNode.left = pRootOfTree;
            pRootOfTree.right = rNode;
        }
        return head;
    }

    public static TreeNode traversal(TreeNode treeNode) {
        TreeNode temp;
        if (treeNode.left == null && treeNode.right == null) {
            return treeNode;
        } else if (treeNode.left == null && treeNode.right != null) {
            temp = traversal(treeNode.right);
            treeNode.right = temp;
            temp.left = treeNode;
            return treeNode;
        } else if (treeNode.left != null && treeNode.right == null) {
            temp = traversal(treeNode.left);
            treeNode.left = temp;
            temp.right = treeNode;
            return treeNode;
        } else {
            temp = traversal(treeNode.left);
            temp.right = treeNode;
            treeNode.left = temp;
            temp = traversal(treeNode.right);
            temp.left = treeNode;
            treeNode.right = temp;
            return temp;
        }
    }

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}