class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char c[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(b);
        if(Arrays.equals(c,b))
        {
            return true;
        }
 return false;
        
    }
}