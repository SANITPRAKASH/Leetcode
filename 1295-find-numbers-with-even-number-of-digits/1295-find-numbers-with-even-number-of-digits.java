class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; // Declare count outside the loop
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) { // Pass nums[i] instead of i
                count++;
            }
        }
        return count; // Return the final count
    }

    // Check if the number of digits is even
    static boolean even(int no) {
        int countno = count(no);
        return countno % 2 == 0; // Return true if even
    }

    // Count the number of digits in a number
    static int count(int no) {
        if (no == 0) {
            return 1; // Edge case: 0 has 1 digit
        }
        int countnum = 0; // Declare countnum outside the loop
        while (no > 0) {
            countnum++;
            no = no / 10;
        }
        return countnum;
    }
}