import java.util.HashSet;

public class Solution {

    public static int lengthOfLongestStrWithoutRep(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String str1 = "jfjadsfaffas fjsd";
        String str2 = "oiuijjknd iijs fknfgsdfbgbgl;sfghbg;";

        System.out.println(lengthOfLongestStrWithoutRep(str1));
        System.out.println(lengthOfLongestStrWithoutRep(str2));
    }
}
