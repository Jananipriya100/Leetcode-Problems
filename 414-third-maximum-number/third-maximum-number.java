class Solution {
    public int thirdMax(int[] arr) {
     ArrayList<Integer>list=new ArrayList<>();
     for(int i=0;i<arr.length;i++)
     {
        if(!list.contains(arr[i]))
        {
            list.add(arr[i]);
        }
     }
     Collections.sort(list,Collections.reverseOrder());
    
        if(list.size()>=3)
        {
            return list.get(2);
        }
        else
        {
           return list.get(0);
        }
     

}     
    
}