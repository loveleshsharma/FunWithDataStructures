package Implementations.heap;

import java.util.Arrays;

/**
 *The heap class implements Min heap.In min heap, the data contained in each node
 * is less than(or equal to) the data in the node's children.The Min heap here is implemented
 * using Array
 */

public class MinHeap implements Heap {

    private int heap[];
    private int size;

    /**
     * Initializes an empty heap
     */
    public MinHeap() {
        heap = new int[20];   // initially empty heap with size 10
        size=-1;
    }

    /**
     * Increases the array capacity as required.
     */
    private void ensureCapacity() {
        if(size == heap.length) {
            heap = Arrays.copyOf(heap, heap.length*2);
        }
    }

    /**
     * Inserts the given key into the MinHeap at its appropriate location.
     * It uses heapify up strategy to arrange the elements of MinHeap at appropriate location.
     * @param key
     */
    @Override
    public void insert(int key) {
        ensureCapacity();
        size++;
        heap[size] = key;
        heapifyUp();
    }

    /**
     * Deletes the given key from the MinHeap. It uses heapify down strategy
     * to arrange the elements of MinHeap at appropriate location.
     */
    @Override
    public void delete() {
        if(size < 0) return;
        heap[0] = heap[size];
        size--;
        heapifyDown();
    }

    /**
     * Returns whether MinHeap is empty or not.
     * @return
     */
    @Override
    public boolean isEmpty() {
        if(size<0)
            return true;
        return false;
    }

    /**
     * Returns the size of MinHeap.
     * @return
     */
    @Override
    public int heapSize() {
        return size+1;
    }

    /**
     * Heapify the elements upwards in the MinHeap.
     * This method is invoked when an element is inserted into the MinHeap.
     */
    private void heapifyUp() {
        int index = size;
        int parent;
        while(index > 0) {
            parent = getParent(index);
            if(heap[index] < heap[parent])
                swap(index,parent);
            index = getParent(index);
        }
    }

    /**
     * Heapify the elements downwards in the MinHeap.
     * This method is invoked when an element is deleted from the MinHeap
     */
    private void heapifyDown() {
        int index = 0;
        int leftChild,rightChild;
        while(index < size) {
            leftChild = getLeftChild(index);
            rightChild = getRightChild(index);
            if(heap[leftChild] > heap[rightChild]) {
                if(rightChild <= size) swap(index,rightChild);
                index = getRightChild(index);
            } else {
                if(leftChild <= size) swap(index,leftChild);
                index = getLeftChild(index);
            }
        }
    }

    /**
     * Swaps the elements in the MinHeap.
     * @param i
     * @param j
     */
    private void swap(int i,int j) {
        heap[i] = heap[i]+heap[j];
        heap[j] = heap[i]-heap[j];
        heap[i] = heap[i]-heap[j];
    }

    /**
     * Prints the MinHeap as an Array
     */
    public void printHeapAsArray() {
        System.out.println();
        for(int i=0;i<=size;i++) {
            System.out.print(heap[i]+" ");
        }
    }

    /**
     * Returns the index of the parent node.
     * @param index
     * @return
     */
    private int getParent(int index) {return (index-1)/2;}

    /**
     * Returns the index of the left child of the node.
     * @param index
     * @return
     */
    private int getLeftChild(int index) {return (index*2)+1;}

    /**
     * Returns the index of the right child of the node.
     * @param index
     * @return
     */
    private int getRightChild(int index) {return (index*2)+2;}
}
