//Brute force Approach

import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int sum = nums[i] + nums[j];

                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        // Input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Create object
        Solution obj = new Solution();

        // Call twoSum()
        int[] ans = obj.twoSum(nums, target);

        // Print answer
        System.out.println(Arrays.toString(ans));
    }
}

 
