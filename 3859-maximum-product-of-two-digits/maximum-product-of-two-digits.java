class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        while(n!=0)
        {
            int r=n%10;
            list.add(r);
            n=n/10;
        }
       // Collections.sort(list,Collections.reverseOrder());
      //  return list.get(0)*list.get(1);
      Collections.sort(list);
      return list.get(list.size()-1)*list.get(list.size()-2);
     
       // System.out.print(list);
       // return 7;

       
    }
}