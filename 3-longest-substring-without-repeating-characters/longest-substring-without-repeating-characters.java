class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int size = 0;
        int left =0, right =0;
        int[] buff = new int[128];
        while(left<s.length() && right<s.length()){
            char ch = s.charAt(right);
            if(buff[(int)ch]<1){
                size = Math.max(right-left+1, size);
                buff[(int)ch]++;
                right++;
            }else{
                buff[(int)s.charAt(left)]--;
                left++;
            }
        }
        return size;
    }
}