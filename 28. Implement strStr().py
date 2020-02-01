class Solution {
    public int strStr(String source, String target)  {
        if (source == null || target == null || source.length() < target.length() ) {
            return -1;
        }
        if (target.equals("")) {
            return 0;
        }
        int i = 0;
        int j = 0;
         while (i < source.length()) {
            if (source.charAt(i) == target.charAt(j)) {
                j++;
            }
             else {
                 i=i-j;
                 j=0;
             }
             i++;
             
            if (j == target.length())
            return i-j;
         }
        return -1;
        

        
    }
}
