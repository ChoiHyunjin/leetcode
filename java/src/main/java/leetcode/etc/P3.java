package leetcode.etc;

import java.util.Arrays;

public class P3 {
  int lengthOfLongestSubstring(String s) {
    int[] flags = new int[256];
    int max = 0;
    int ptr = 0;
    Arrays.fill(flags, -1);

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (flags[ch] >= 0) {
        ptr = Math.max(flags[ch] + 1, ptr);
      }
      max = Math.max(i - ptr + 1, max);
      flags[ch] = i;
    }

    return max;
  }

  public static void main(String[] args) {
    P3 obj = new P3();
    System.out.println(obj.lengthOfLongestSubstring("ohomm"));
    System.out.println(obj.lengthOfLongestSubstring("dvdf"));
    System.out.println(obj.lengthOfLongestSubstring("abcb"));
    System.out.println(obj.lengthOfLongestSubstring("abba"));
    System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
    System.out.println(obj.lengthOfLongestSubstring("bb"));
    System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
    System.out.println(obj.lengthOfLongestSubstring("aab"));
    System.out.println(obj.lengthOfLongestSubstring("au"));
  }
}
