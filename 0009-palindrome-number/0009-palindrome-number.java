class Solution {
    public boolean isPalindrome(int x) {
        
        String orignal = Integer.toString(x);
        String reversed = "";

        for(int i = orignal.length()-1; i>=0; i--){

            reversed+=orignal.charAt(i);
        }

        if(reversed.equals(orignal)){

            return true;
        }
        return false;
    }
}