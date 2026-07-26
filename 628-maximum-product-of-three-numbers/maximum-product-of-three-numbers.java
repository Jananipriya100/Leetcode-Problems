class Solution {
    public int maximumProduct(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
         Collections.sort(list);
         int n=list.size();
         int pro= list.get(n-1)*list.get(n-2)*list.get(n-3);
         int pro2=list.get(0)*list.get(n-1)*list.get(1);
         return Math.max(pro,pro2);
        
    }
}