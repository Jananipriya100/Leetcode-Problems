class Solution {
    public int lengthOfLastWord(String s) {
        String[]  ss= s.split(" ");
       
        String n= ss[ss.length-1];
        return n.length();
    }
}