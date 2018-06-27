package Problems;

import Implementations.BinarySearchTree;

public class DriverProgram {

    public static void main(String...args) {
        BinarySearchTree BST = new BinarySearchTree(4);
        BST.insertNode(7);
        BST.insertNode(3);
        BST.insertNode(6);
        BST.insertNode(8);
        BST.insertNode(5);
        BST.printInOrder();
        BST.deleteNode(4);
        BST.printInOrder();
        System.out.println();
    }
}
