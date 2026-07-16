class Solution {
    public int findNumbers(int[] n) {
        int ans=0;
   for(int i=0;i<n.length;i++)
    {
    int   nums=n[i];
      int count=0;
      while(nums!=0)
      {
        count++;
        nums=nums/10;
      }
      if(count%2==0)
      {
        ans++;
      }
    }
    return ans;
    }
}