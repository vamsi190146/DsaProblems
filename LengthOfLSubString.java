import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String testString = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + solution.lengthOfLongestSubstring(testString));
    }
}
