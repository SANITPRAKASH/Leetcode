class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle case when k > n

        reverse(nums, 0, n - 1);   // Step 1: Reverse entire array
        reverse(nums, 0, k - 1);   // Step 2: Reverse first k elements
        reverse(nums, k, n - 1);   // Step 3: Reverse remaining elements
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {  // Keep swapping until start < end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
