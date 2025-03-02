package BinarySearch;

import java.util.Arrays;

public class _2_KokoEatingBananas {
}

class Solution2 {
    public int minEatingSpeed(int[] piles, int h) {
        // maximum speed = number of banana in the largest pile
        // 1 <= speed <= maximum speed
        int left = 1;
        int result = -1;
        int right = Arrays.stream(piles).max().getAsInt();
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int totalTime = 0;
            for (int pile : piles) {
                totalTime += (int) Math.ceil(1.0 * pile / mid);
            }
            if (totalTime <= h){
                result = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return result;
    }
}
