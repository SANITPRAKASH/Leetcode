class Solution {
   public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // No mismatches
    }
}