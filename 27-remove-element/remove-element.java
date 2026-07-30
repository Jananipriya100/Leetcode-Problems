class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> al= new LinkedList<>();
        // for(int i=0; i<nums.length; i++){
        //     al.add(nums[i]);
        // }
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=val){
                nums[i]=nums[j]+nums[i]-(nums[j]=nums[i]);
                al.add(nums[i]);
                i++;
            }
        }
        return al.size();
    }
}