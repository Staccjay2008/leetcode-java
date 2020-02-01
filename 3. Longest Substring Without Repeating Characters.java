class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null)
            return -1;
        int n=s.length();
        int maxLen=0;
        int i=0;
        int j=0;
        Set<Character> set=new HashSet<Character>();
        while(i<n&j<n){
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));  
                maxLen=Math.max(maxLen,j-i);
            }
            else {
                set.remove(s.charAt(i++));
            }
                           }
                          return maxLen; 
    }
                            }
                        
