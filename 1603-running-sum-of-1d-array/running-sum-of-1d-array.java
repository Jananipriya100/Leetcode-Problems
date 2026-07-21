class Solution {
    public int[] runningSum(int[] nums) {
        //ArrayList<Integer>list=new ArrayList<>();
        int arr[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            arr[i]=sum;
        }
        return arr;
        
    }
}