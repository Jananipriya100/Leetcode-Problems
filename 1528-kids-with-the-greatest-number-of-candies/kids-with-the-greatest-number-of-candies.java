class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int extraCandies) {                                                       
        ArrayList<Boolean>list=new ArrayList<>();
        int max=can[0];
        for(int i=0;i<can.length;i++)
        {
        if(can[i]>max)
        {
            max=can[i];
        }
        }
        for(int i=0;i<can.length;i++)
        {
            if(can[i]+extraCandies>=max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;

    }
}