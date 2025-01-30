class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reverse=0;
        while(x>0){
            int last_digit=x%10;
            reverse=reverse*10+last_digit;
            x=x/10;
         }
         return reverse==original;
         
        
    }
}