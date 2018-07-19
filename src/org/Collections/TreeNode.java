package org.Collections;

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        // optional
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return data + "";
    }
}
