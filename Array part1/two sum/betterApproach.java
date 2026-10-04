//better Approach (two pointer approach) for two sum

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = nums.clone();

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                // Find original indices
                int index1 = -1;
                int index2 = -1;

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == arr[left] && index1 == -1) {
                        index1 = i;
                    } 
                    else if (nums[i] == arr[right] && index2 == -1) {
                        index2 = i;
                    }
                }

                return new int[]{index1, index2};
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}