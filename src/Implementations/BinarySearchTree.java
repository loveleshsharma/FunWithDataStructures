package Implementations;

public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree(int key) {
        root = new TreeNode(key);
    }

    public void insertNode(int key) {
        root.insert(key);
    }

    public void deleteNode(int key) {
        root.delete(key);
    }
    
    public boolean containsKey(int key) {
        return root.contains(key);
    }

    public void printInOrder() {
        root.inOrder();
        System.out.println();
    }
}

class TreeNode {
    Integer data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int key) {
        data = key;
    }

    public void insert(int key) {
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

    public void delete(int key) {
        TreeNode searchNode = searchNode(key);
        if(searchNode != null) {
            deleteNode(searchNode,key);
        }
    }

    private void deleteNode(TreeNode searchNode,int key) {



    }

    private int min_value(TreeNode root) {

        int min = root.data;
        while(root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public boolean contains(int key) {
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

    private TreeNode searchNode(int key) {
        if(key == data)
            return this;
        else if(key < data) {
            if(left == null)
                return null;
            else
                return left.searchNode(key);
        }
        else if(key > data) {
            if(right == null)
                return null;
            else
                return right.searchNode(key);
        }
        return null;
    }

    public void inOrder() {
        if(left != null)
            left.inOrder();
        System.out.print(data+" ");
        if(right != null)
            right.inOrder();
    }
}
