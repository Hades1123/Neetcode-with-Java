package LinkedList;

import java.util.HashSet;

public class FindTheDuplicateNumber {
}

// Using hashmap : Time complexity O(1), space: O(n)
class Solution8 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                return num;
            }

        }
        return -1;
    }
}

// negative marking: Time:O(n), Space:O(1)
class Solution8_1 {
    public int findDuplicate(int[] nums) {
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[Math.abs(nums[i])] < 0){
                return Math.abs(nums[i]);
            }
            else{
                nums[Math.abs(nums[i])] *= -1;
            }
        }
        return -1;
    }
}
