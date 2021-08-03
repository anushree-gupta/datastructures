class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;// to store the max length of a substring
        //To store the char which have already occurred 
        Set<Character> charSet= new HashSet<Character>();
        char[] chars= s.toCharArray();
        int len=chars.length;
        //To iterate over all the char of string.
        while(right<len){
            char c=chars[right];
            if(charSet.add(c)){
                if(right-left+1 >max)
                max=right-left+1;
              
                right++; 
            }else{
                while(chars[left]!=c ){
                    charSet.remove(chars[left]);
                    left++;
                }
                charSet.remove(c);
                    left++;
            }
        }
        System.gc();
        return max;
        
    }
        
        
}
