package Problems;

import Implementations.heap.MinHeap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DriverProgram {

    public static void main(String...args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(3);
        minHeap.insert(4);
        minHeap.insert(8);
        minHeap.insert(9);
        minHeap.insert(7);
        minHeap.insert(10);
        minHeap.insert(9);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(13);
        minHeap.printHeapAsArray();
        minHeap.delete();
        minHeap.printHeapAsArray();
        minHeap.delete();
        minHeap.printHeapAsArray();
        System.out.println(minHeap.isEmpty());
        System.out.println(minHeap.heapSize());



    }
}
