package Implementations;

/**
 * Implementation of Binary Search Tree(BST) with all its necessary functions
 * used for basic manipulations
 * @author lovelesh
 */
public class BinarySearchTree {

    private TreeNode root;

    /**
     * Initializes BST with the root node
     * @param key
     */
    public BinarySearchTree(int key) {
        root = new TreeNode(key);
    }

    /**
     * Inserts node into BST
     * @param key
     */
    public void insertNode(int key) {
        root.insert(key);
    }

    /**
     * Deletes node from BST
     * @param key
     */
    public void deleteNode(int key) {
        root = root.deleteNode(key);
    }

    /**
     * Searches for a key present in the BST or not
     * @param key
     * @return
     */
    public boolean containsKey(int key) {
        return root.contains(key);
    }

    /**
     * Prints inorder traversal of the BST
     */
        public void printInOrder() {
        root.inOrder();
        System.out.println();
    }

    /**
     * Prints preorder traversal of the BST
     */
    public void printPreOrder() {
        root.preOrder();
        System.out.println();
    }

    /**
     * Prints postorder traversal of the BST
     */
    public void printPostOrder() {
        root.postOrder();
        System.out.println();
    }
}

class TreeNode {
    private Integer data;
    private TreeNode left;
    private TreeNode right;

    TreeNode(int key) {
        data = key;
    }

    void insert(int key) {
        if(key < data) {
            if(left == null) {
                left = new TreeNode(key);
            } else {
                left.insert(key);
            }
        } else {
            if(right == null) {
                right = new TreeNode(key);
            } else {
                right.insert(key);
            }
        }
    }

    TreeNode deleteNode(int key) {

        if(data == null) return null;

        if(key < data) {
            if(left != null)
                left = left.deleteNode(key);
            else
                return null;
        } else if(key > data) {
            if(right != null)
                right = right.deleteNode(key);
            else
                return null;
        } else {

//            either child is null
            if(left == null) {
                return right;
            } else if(right == null)
                return left;

//            both children are present
            data = min_value(right);
            right = right.deleteNode(key);
        }
        return this;
    }

    int min_value(TreeNode root) {

        int min = root.data;
        while(root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    boolean contains(int key) {
        if(key == data)
            return true;
        else if(key <= data) {
            if(left == null)
                return false;
            else
                return left.contains(key);
        } else {
            if(right == null)
                return false;
            else
                return right.contains(key);
        }
    }

    void inOrder() {
        if(left != null)
            left.inOrder();
        System.out.print(data+" ");
        if(right != null)
            right.inOrder();
    }

    void preOrder() {
        System.out.println(data+" ");
        if(left != null)
            left.preOrder();
        if(right != null)
            right.preOrder();
    }

    void postOrder() {
        if(left != null)
            left.postOrder();
        if(right != null)
            right.postOrder();
        System.out.println(data+" ");
    }
}
