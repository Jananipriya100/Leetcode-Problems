class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int squ=0;
        for(int i=0;i<nums.length;i++)
        {
            squ=nums[i]*nums[i];
            list.add(squ);
        }
        Collections.sort(list);
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=list.get(i);
        }
        return arr;
    }
}