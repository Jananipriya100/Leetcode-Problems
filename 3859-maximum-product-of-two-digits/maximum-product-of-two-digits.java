class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list=new ArrayList<>();
       
        while(n!=0)
        {
            int r=n%10;

            list.add(r);
            n=n/10;
        }
       Collections.sort(list);
       //System.out.print(list);
    //  return 7;
    int j=0;
    int pro=1;
    for(int i=list.size()-1;i>=0;i--)
    {
        pro=pro*list.get(i);
        j++;
        if(j==2)
        {
            break;
        }
    }
    
        return pro;
    }
}