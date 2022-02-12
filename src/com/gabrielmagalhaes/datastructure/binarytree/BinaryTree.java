package com.gabrielmagalhaes.datastructure.binarytree;

public class BinaryTree {
    private BinaryTree left;
    private BinaryTree right;

    private int key;

    public BinaryTree(int key) {
        this.key = key;
    }

    public void Insert(BinaryTree tree, int key) {
        if (tree.key < key) {
            if (tree.left == null) {
                tree.left = new BinaryTree(key);
            } else {
                Insert(tree.left, key);
            }
        } else if (tree.key > key) {
            if (tree.right == null) {
                tree.right = new BinaryTree(key);
            } else {
                Insert(tree.right, key);
            }
        }
    }

    public boolean Search(BinaryTree tree, int key) {
        if (tree == null) {
            return false;
        }

        if (tree.key < key) {
            return Search(tree.left, key);
        } else if (tree.key > key) {
            return Search(tree.right, key);
        }

        return true;
    }
}
