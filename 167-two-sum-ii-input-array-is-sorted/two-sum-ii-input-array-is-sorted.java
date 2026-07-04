class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                // The problem requires 1-based indexing
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                left++; // Move left pointer right to increase the sum
            } else {
                right--; // Move right pointer left to decrease the sum
            }
        }
        
        // Return an empty array if no solution is found 
        // (though constraints guarantee exactly one solution)
        return new int[]{-1, -1}; 
    }
}