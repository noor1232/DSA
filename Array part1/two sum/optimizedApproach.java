//Optimized approach (Hashing approach) for two sum
import java.util.HashMap;
//import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] arr, int tar) {

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int first = arr[i];
            int second = tar - first;

            if (m.containsKey(second)) {
                return new int[]{i, m.get(second)};
            }

            m.put(first, i);
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;        
        Solution obj = new Solution();        
        int[] ans = obj.twoSum(nums, target);

       
        System.out.println(Arrays.toString(ans));
    }
}
