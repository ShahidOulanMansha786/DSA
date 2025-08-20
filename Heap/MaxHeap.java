package Heap;

public class MaxHeap 
{
    public int[] heapArray;
    public int current_size;
    public int total_size;

    MaxHeap(int total_size){
        this.total_size = total_size;
        this.current_size = -1;
        heapArray = new int[this.total_size];
    }

    int parentIndex(int index){
        return (index - 1) / 2;
    }

    void swap(int[] arr, int first, int sec){
        int temp = arr[sec];
        arr[sec] = arr[first];
        arr[first] = temp;
    }

    private void insertIntoHeap(int val){
        current_size++;
        heapArray[current_size] = val;
        int i = current_size;

        while(i > 0 && heapArray[i] > heapArray[parentIndex(i)]){
            swap(heapArray, i, parentIndex(i));
            i = parentIndex(i);
        }
        
    }

    public void insert(int val){
        if(current_size == total_size - 1)
        {
            System.out.println("Heap is full");
            return;
        }
        insertIntoHeap(val);       
    }

    void printHeap(){

        for(int i = 0; i <= current_size; i++){
            System.out.println(heapArray[i]);
        }
    }

    void heapify(int index){

        int maxi = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if(left <= current_size && heapArray[maxi] < heapArray[left])
            maxi = left;
        if(right <= current_size && heapArray[maxi] < heapArray[right])
            maxi = right;
        
        if(maxi != index){
            swap(heapArray, index, maxi);
            heapify(maxi);
        }        
    }
    void delete(){
        if(current_size == -1){
            System.out.println("There is nothing to delete");
            return;
        }

        System.out.println(heapArray[0] + " has deleted");
        heapArray[0] = heapArray[current_size];
        current_size--;
        if(current_size == -1)
            return;
        
        heapify(0);

    }
}
