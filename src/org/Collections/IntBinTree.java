package org.Collections;

public class IntBinTree {

    private TreeNode root;
    private int size;

    IntBinTree() {
        this.size = 0;
    }


    /**
     *
     */

    TreeNode addRecursive(TreeNode current, int element) {
        if (current == null) {
            return new TreeNode(element);
        }

        if (element < current.data) {
            current.left = addRecursive(current.left, element);
        } else if (element > current.data) {
            current.right = addRecursive(current.right, element);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    /**
     *
     */

    void add(int element){
        root = addRecursive(root, element);
    }


    /**
     *
     */

    IntBinTree createBinTree() {
        IntBinTree intBinTree = new IntBinTree();

        intBinTree.add(1);
        intBinTree.add(2);
        intBinTree.add(3);
        intBinTree.add(4);
        intBinTree.add(5);

        return intBinTree;

    }

    /**
     *
     */

    private boolean containsRecursive(TreeNode current, int element) {
        if (current == null) {
            return false;
        }
        if (element == current.data) {
            return true;
        }
        return element < current.data
                ? containsRecursive(current.left, element)
                : containsRecursive(current.right, element);
    }

    /**
     *
     */

    boolean contains(int element) {
        return containsRecursive(root, element);
    }

    /**
     *
     */

    private TreeNode removeRecursive(TreeNode current, int element) {
        if (current == null) {
            return null;
        }

        if (element == current.data) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (element < current.data) {
            current.left = removeRecursive(current.left, element);
            return current;
        }
        current.right = removeRecursive(current.right, element);
        return current;
    }

    /**
     *
     */

    void remove(){

    }

    /**
     *
     */

    private boolean isEmpty(){
        return size == 0;
    }

}
