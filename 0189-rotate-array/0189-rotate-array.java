class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length-1;

        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);

        


        
    }

    static void reverse(int[] arr,int start,int end){
        while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
        start++;
        end--;
        }

    }
}