import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] last = new int[128];
        Arrays.fill(last, -1);

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            left = Math.max(left, last[ch] + 1);

            max = Math.max(max, right - left + 1);

            last[ch] = right;
        }

        return max;
    }
}