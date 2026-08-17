class Solution {
    public boolean isPalindrome(String s) {
      String str=s.replace(" ","");
      str=str.toLowerCase();
      int end=str.length()-1;
      int start=0;
      while(start<end)
      {
          while (start < end &&!Character.isLetterOrDigit(str.charAt(start)))
        start++;
          while (start < end &&!Character.isLetterOrDigit(str.charAt(end)))
        end--;
        char a=str.charAt(start);
        char b=str.charAt(end);
        if(a!=b)
        {
            return false;
        }
        start++;
        end--;
      }  
      return true;
    }
}
