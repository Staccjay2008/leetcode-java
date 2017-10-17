class Solution {
    public boolean judgeCircle(String moves) {
        int left = 0, right = 0, up = 0, down = 0;
        for(int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') 
                up++;
            else if (moves.charAt(i) == 'D') 
                down++;
            else if (moves.charAt(i) == 'L')
                left++;
            else right++;
        }
        if(left == right && up == down)
            return true;
        else return false;
        
    }
}
