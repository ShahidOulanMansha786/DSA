package Heap;

public class App {

    public static void main(String[] args) {
        // MaxHeap h = new MaxHeap(6);
        // h.insert(78);
        // h.insert(89);
        // h.insert(45);
        // h.insert(90);
        // h.insert(100);
        // h.insert(109);
        // h.insert(80);
        // h.printHeap();
        // h.delete();
        // h.printHeap();
        // h.delete();
        // h.delete();
        // h.delete();
        // h.delete();
        // h.delete();
        // h.delete();
        // h.printHeap();

        MinHeap h2 = new MinHeap(6);
        h2.insert(10);
        h2.insert(3);
        //h2.printHeap();
        h2.insert(7);
        h2.insert(1);
        h2.insert(0);
        h2.printHeap();
        h2.insert(19);
        h2.insert(20);
        System.out.println("****************");

        h2.Delete();
        h2.printHeap();
        h2.Delete();
        h2.printHeap();
        h2.Delete();
       
        h2.Delete();
        h2.Delete();
        h2.Delete();
        h2.printHeap();
        h2.Delete();

        
    }
}