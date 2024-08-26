https://leetcode.com/problems/valid-anagram/description/

#code    -----------------one way
  class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
      int [] freq = new int[26];

      for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
      }  

      for(int ele :freq){
        if(ele!=0){
            return false;
        }
      }


      return true;
    }
}


#----------two way


  class Solution {
    public boolean isAnagram(String s, String t) {
        char [] ch = s.toCharArray();
        char [] ch1 = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);

        return Arrays.equals(ch,ch1);
    }
}
