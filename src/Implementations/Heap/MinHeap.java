package Implementations.Heap;

import java.util.Arrays;

/**
 *The heap class implements Min Heap.In min heap, the data contained in each node
 * is less than(or equal to) the data in the node's children.The Binary Heap here is implemented
 * using Array
 */

public class MinHeap implements Heap {

    private int heap[];
    private int size;

    public MinHeap() {
        heap = new int[20];   // initially empty heap with size 10
        size=-1;
    }

    @Override
    public void insert(int key) {
        size++;
        heap[size] = key;
        heapifyUp();
    }

    @Override
    public void delete() {
        heap[0] = heap[size];
        size--;
        heapifyDown();
    }

    @Override
    public boolean isEmpty() {
        if(size<0)
            return true;
        return false;
    }

    @Override
    public int heapSize() {
        return size+1;
    }

    @Override
    public void heapifyUp() {
        int index = size;
        int parent;
        while(index > 0) {
            parent = (index-1)/2;
            if(heap[index] < heap[parent])
                swap(heap,index,parent);
            index = (index-1)/2;
        }
    }

    @Override
    public void heapifyDown() {

    }

    private void swap(int heap[],int i,int j) {
        heap[i] = heap[i]+heap[j];
        heap[j] = heap[i]-heap[j];
        heap[i] = heap[i]-heap[j];
    }

    public void printHeapAsArray() {
        System.out.println();
        for(int i=0;i<=size;i++) {
            System.out.print(heap[i]+" ");
        }
    }
}
