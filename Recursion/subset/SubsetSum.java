// import java.util.ArrayList;
// import java.util.List;


public class SubsetSum {


    /* brute force technique
     * 
     * ma har aik subset find karo ga or har aik subset ka lia sum calculate karo ga.
     * iss sa meri time complexity ho jaye gi : O(n*2^n)
     * n = har array ka sum calculate karna ka lia.
     * 2^n = har aik subset generate karna ka lia. 
     *  
     */

    // public static void main(String[] args) {
    //     int[] num = {3, 4, 5};
    //     List<Integer> temp = new ArrayList<>();
    //     List<Integer> containSum = new ArrayList<>();

    //     generateSubsets(num, temp, 0, containSum);
    //     System.out.println(sumOfArray(containSum));
    // }

    // public static int sumOfArray(List<Integer> nums){
    //     int sum = 0;
    //     for(int i : nums){
    //         sum += i;
    //     }
    //     return sum;
    // }

    // public static void generateSubsets(int[] in, List<Integer> out, int n, List<Integer> sumOfEachSubset){
    //     if(n == in.length){
    //         sumOfEachSubset.add(sumOfArray(out));
    //         return;
    //     }

    //     out.add(in[n]);
    //     generateSubsets(in, out, n+1, sumOfEachSubset);
    //     out.remove(out.size() - 1);

    //     generateSubsets(in, out, n+1, sumOfEachSubset);
    // }








    /*
     * Optimized Version (Sum Carry Approach)
     * 
     * iss ma hummm sum ko har recursive call ka sath carry karta hai takaa sum har leaf node par ready milaa
     * time complexity = O(2^n)
     */

    // public static void main(String[] args) {
    //     List<Integer> sums = new ArrayList<>();
    //     int[] nums = {3, 4, 5};
    //     generateSubsetAndSum(nums, 0, 0, sums);
    //     int total = 0;
    //     for(int i : sums) total += i;
    //     System.out.println(total);
    // }

    // public static void generateSubsetAndSum(int[] in, int index, int sum, List<Integer> sums){
    //     if(index == in.length){
    //         sums.add(sum);
    //         return;
    //     }

    //     // include sum (include element in a subarray)
    //     generateSubsetAndSum(in, index+1, sum + in[index], sums);

    //     // exclude sum (exclude element from a subarray)
    //     generateSubsetAndSum(in, index+1, sum, sums);
    // }

    /*
     * most optimized approach using mathematical formula : O(n)
     * 
     * sum_of_all_subsets = sum_of_array_elements * 2^(n - 1)
     * 
     */


    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        System.out.println(generateSubsetSum(arr));
        
    }


    public static int generateSubsetSum(int[] arr){
        int sum = 0, n = arr.length;
        for(int i : arr) sum += i;
        sum *= 1 << (n - 1 );
        return sum;
    }


}
