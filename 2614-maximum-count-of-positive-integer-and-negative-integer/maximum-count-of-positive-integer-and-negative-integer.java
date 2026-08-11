class Solution {
    public int maximumCount(int[] nums) {
        // Binary Search 1:
        int n = nums.length;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= 0) {
                hi = mid - 1;   
            } else {
                lo = mid + 1;  
            }
        }
        int negCount = lo;
        // Binary Search 2:
        lo = 0;
        hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= 0) {
                lo = mid + 1;  
            } else {
                hi = mid - 1;   
            }
        }
        int posCount = n - lo;
        return Math.max(negCount, posCount);      
    }
}