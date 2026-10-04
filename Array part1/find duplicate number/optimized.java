import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> s = new HashSet<>();

        for (int value : nums) {

            if (s.contains(value)) {
                return value;
            }

            s.add(value);
        }

        return -1;
    }
}