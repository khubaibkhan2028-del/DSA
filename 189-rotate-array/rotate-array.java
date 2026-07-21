class Solution {
    public void rotate(int[] nums, int k) {
    
        int n = nums.length;
        k = k % n;

        // 1. Reverse the entire array first
        reverse(nums, 0, n - 1);
        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);
        // 3. Reverse the rest
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

      
