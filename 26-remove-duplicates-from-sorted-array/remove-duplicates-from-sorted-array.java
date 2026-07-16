class Solution {
    public int removeDuplicates(int[] arr) {
     int n=1;
     for(int i=1;i<arr.length;i++)
     {
        if(arr[i]!=arr[i-1])
        {
            arr[n]=arr[i];
            n++;
        }
     }
     return n;
    }
}