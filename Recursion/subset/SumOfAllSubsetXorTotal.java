
public class SumOfAllSubsetXorTotal {

    /*
     * Total XOR sum=(OR of all nums) × 2 ^ (n−1)
     */
    public int subsetXORSum(int[] nums) {
    
        int t = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            t |= nums[i];
        }
    
        return t * (1 << (n-1));
        
    }
}
