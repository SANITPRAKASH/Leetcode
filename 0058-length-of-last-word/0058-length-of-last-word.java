class Solution {
    public int lengthOfLastWord(String s) {

        String words[]= s.trim().split("\\s+");
        int lastindex=words.length-1;
        return words[lastindex].length();

        
    }
}