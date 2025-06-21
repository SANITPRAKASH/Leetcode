class Solution {
   public static String reverseWords(String s) {
        s = s.trim();  // Remove leading and trailing spaces
        String[] words = s.split("\\s+");  // Split on one or more spaces

        // Reverse the words array
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Join the reversed words with a single space
        return String.join(" ", words);
    }
}