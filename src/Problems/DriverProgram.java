package Problems;

import Implementations.BinarySearchTree;
import Implementations.Heap.MinHeap;

public class DriverProgram {

    public static void main(String...args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(2);
        minHeap.insert(4);
        minHeap.insert(8);
        minHeap.insert(9);
        minHeap.insert(7);
        minHeap.insert(10);
        minHeap.insert(9);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(13);
        minHeap.insert(3);
        minHeap.printHeapAsArray();


    }
}
