class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result=new int[nums.length];
       int product=1;
       int zeroes=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zeroes++;
        }
        else{
        product*=nums[i];
        }
       }
       for(int i=0;i<nums.length;i++){
        if(zeroes>1){
            result[i]=0;
        }
        else if(zeroes==1){
         result[i]=nums[i]==0?product:0;
        }
        else{
             result[i] = product / nums[i];
        }
       }
       return result;
    }
}