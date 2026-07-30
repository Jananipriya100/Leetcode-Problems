class Solution {
    public void reverse(int i,int j,int nums[]){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length-1;
        for(int i = n-1;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx==-1){
            reverse(0,n,nums);
        }
        else{
            for(int i = n;i>idx;i--){
                if(nums[i]>nums[idx]){
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                    
                }
            }
            reverse(idx+1,n,nums);
        }


       

        
    }
}