class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int size = 0;
        for(int i =0; i< s.length(); i++){
            int[] buff = new int[128];
            for(int j = i; j< s.length(); j++){
                char ch = s.charAt(j);
                if(buff[(int)ch]==0){
                    buff[(int)ch]++;
                    size = Math.max(j-i+1, size);
                }
                else{
                    break;
                }
            }
        }
        return size;
    }
}