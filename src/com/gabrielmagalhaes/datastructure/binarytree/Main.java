package com.gabrielmagalhaes.datastructure.binarytree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(100);

        tree.Insert(tree, 47);
        tree.Insert(tree, 20);
        tree.Insert(tree, 13);
        tree.Insert(tree, 23);
        tree.Insert(tree, 49);

        tree.Insert(tree, 65);
        tree.Insert(tree, 78);
        tree.Insert(tree, 70);
        tree.Insert(tree, 54);
        tree.Insert(tree, 89);

        System.out.println(tree);

        System.out.println("Value 23 exists in binary tree? " + tree.Search(tree, 23));
        System.out.println("Value 70 exists in binary tree? " + tree.Search(tree, 70));
        System.out.println("Value 33 exists in binary tree? " + tree.Search(tree, 33));
    }
}
