package Heap;

public class App {

    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(6);
        h.insert(78);
        h.insert(89);
        h.insert(45);
        h.insert(90);
        h.insert(100);
        h.insert(109);
        h.insert(80);
        h.printHeap();
        h.delete();
        h.printHeap();
        h.delete();
        h.delete();
        h.delete();
        h.delete();
        h.delete();
        h.delete();
        h.printHeap();
        
    }
}