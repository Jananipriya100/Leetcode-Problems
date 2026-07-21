class Solution {
    public void moveZeroes(int[] arr) {
        int n=0;
         for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[n]=arr[i];
                n++;
            }
        }
        for(int i=n;i<arr.length;i++)
        {
            arr[i]=0;
        }
     
    }
}