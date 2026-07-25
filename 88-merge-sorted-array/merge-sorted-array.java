class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            list.add(nums1[i]);
        }
        for(int j=0;j<n;j++)
        {
            list.add(nums2[j]);
        }
        Collections.sort(list);
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
    
   // System.out.print(arr);
    }
}*/
System.arraycopy(nums2,0,nums1,m,n);
Arrays.sort(nums1);
System.out.print(nums1);
    }
}