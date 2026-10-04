//Optimized approach (Hashing approach) for two sum
import java.util.HashMap;
import java.util.ArrayList;

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
}
