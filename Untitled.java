class Solution {
    public boolean isPalindrome(String s) {
        int a = s.length();
        if(s.charAt(0)!=s.charAt(s.length()-1)){
          s = s.substring(1,s.length()-1);
            return isPalindrome(s);
        }
        else return true;
        
    }
}