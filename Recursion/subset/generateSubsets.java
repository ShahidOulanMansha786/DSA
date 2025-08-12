import java.util.ArrayList;
import java.util.List;

public class generateSubsets {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        List<Integer> temp = new ArrayList<>();
        printSubsets(arr, temp, 0);
    }
    
    public static void printSubsets(int[] arr, List<Integer> out, int n){
        if(n == arr.length)
        {
            System.out.println(out);
            return;
        }

        out.add(arr[n]);
        printSubsets(arr, out, n+1);
        out.remove(out.size()-1);
        
        printSubsets(arr, out, n+1);

    }
}