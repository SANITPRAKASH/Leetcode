class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=binarySearch(nums,target,true);
        int end=binarySearch(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
        

  int binarySearch(int[] nums,int target, boolean startIndex){
    int ans=-1;
    int start=0;
    int end=nums.length-1;
    while(start<= end){
        int mid=start+(end-start/2);
        if(target>nums[mid]){
            start=mid+1;
        }else if(target <nums[mid]){
            end=mid-1;
        }else{
            ans=mid;
            if(startIndex){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        
    }
    return ans;
  }
}