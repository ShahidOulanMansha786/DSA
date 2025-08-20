public class MinHeap {
    
    private int[] heapArray;
    private int current_size;
    private int total_size;

    MinHeap(int size){
        this.total_size = size;
        heapArray = new int[size];
        current_size = -1;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    void insertIntoMinHeap(int val)
    {
        current_size++;
        heapArray[current_size] = val;
        int index = current_size;

        while(index > 0 && heapArray[index] < heapArray[(index-1)/2]){
            swap(heapArray, index, (index-1)/2);
            index = (index-1)/2;
        }
    }
    void insert(int value){
        if(current_size-1 == total_size){
            System.out.println("Heap overflow");
            return;
        }
        insertIntoMinHeap(value);
    }

    void printHeap(){
        
        for(int i = 0; i <= current_size; i++){
            System.out.println(heapArray[i]);
        }
    }

    void heapify(int index){
        int maxi = index;
        int left = maxi * 2 + 1;
        int right = maxi * 2 + 2;

        if(left <= current_size && heapArray[maxi] > heapArray[left])
            maxi = left;
        if(right <= current_size && heapArray[maxi] > heapArray[right])
            maxi = right;

        if(maxi != index){
            swap(heapArray, maxi, index);
            heapify(maxi);
        }
    }

    void Delete(){

        if(current_size == -1){
            System.out.println("Heap underflow");
            return;
        }

        heapArray[0] = heapArray[current_size];
        current_size--;
        heapify(0);
    }
}
