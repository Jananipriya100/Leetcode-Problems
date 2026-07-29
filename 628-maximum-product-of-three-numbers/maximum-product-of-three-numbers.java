class Solution {
    public int maximumProduct(int[] nums) {
        int max=0;
       Arrays.sort(nums);
       int len=nums.length;
       int fir=nums[len-1]*nums[len-2]*nums[len-3];
       int sec=nums[0]*nums[1]*nums[len-1];
       return max=Math.max(fir,sec);
    
    }
}