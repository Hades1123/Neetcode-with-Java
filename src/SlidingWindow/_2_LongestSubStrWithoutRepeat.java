package SlidingWindow;

import java.util.Arrays;

public class _2_LongestSubStrWithoutRepeat {
}

// My solution: Time O(N) && Space O(N)
class Solution2{
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[300];
        Arrays.fill(arr, -1);
        int count = 0, maxLen = 0, mark = -1;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == -1 || arr[s.charAt(i)] < mark) {
                count++;
                maxLen = Math.max(maxLen, count);
            }
            else if (arr[s.charAt(i)] >= mark) {
                count = i - arr[s.charAt(i)];
                mark = arr[s.charAt(i)];
            }
            arr[s.charAt(i)] = i;
        }
        return maxLen;
    }
}
