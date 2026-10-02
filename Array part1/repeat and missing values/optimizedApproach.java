//Optimized Aproach

import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        HashSet<Integer> s = new HashSet<>();
        
        int n = grid.length;
        int total = n * n;
        
        int repeated = 0;
        int actualSum = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                int num = grid[i][j];
                actualSum += num;
                
                if (s.contains(num)) {
                    repeated = num;
                }
                
                s.add(num);
            }
        }
        
        int expectedSum = total * (total + 1) / 2;
        
        int missing = expectedSum + repeated - actualSum;
        
        return new int[]{repeated, missing};
    }
}

