class Solution {
    public int maxProfit(int[] arr) {
        int max=arr[0];
        int maxpro=0;
        for(int i=1;i<arr.length;i++)
        {
          if(arr[i]<max)
          {
            max=arr[i];
          }
          int pro=arr[i]-max;
          if(pro>maxpro)
          {
            maxpro=pro;
          }
        }
        return maxpro;
        
    }
}