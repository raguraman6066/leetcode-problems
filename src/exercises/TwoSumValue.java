package exercises;

import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (list.contains(complement)) {
                return new int[] { list.indexOf(complement), i };
            }
            list.add(nums[i]);
        }
        return null;
    }
}
