package Implementations.Heap;

public interface Heap {
    void insert(int key);
    void delete();
    boolean isEmpty();
    int heapSize();
    void heapifyUp();
    void heapifyDown();
}
