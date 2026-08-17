class Solution {
    public int[] productExceptSelf(int[] nums) {
        int r=nums.length;
        int arr[]=new int[r];
        int pre=1;
        int suf=1;
        for(int i=0;i<r;i++)
        {
            arr[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=r-1;i>=0;i--)
        {
            arr[i]=arr[i]*suf;
            suf=suf*nums[i];
        }
        return arr;
    }
}  
