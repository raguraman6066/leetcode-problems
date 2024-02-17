import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        int[] nums = { 1, 2, 3, 1, 2 };
        System.out.println(s1.singleNumber(nums));
        // two
        Solution2 s2 = new Solution2();
        int[] nums2 = { 1, 2, 3, 1, 2 };
        System.out.println(s2.singleNumber2(nums2));

    }

}

class Solution1 {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
}

// second method space complexity (xor operator) a ^ a=0, a^0=a,zero

class Solution2 {
    public int singleNumber2(int[] nums) {
        int ans = nums[0];// 2
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
            System.out.println("loop" + ans);
        }
        return ans;
    }
}
/*
 * 100 (4)
 * ^ 001 (1)
 * ------
 * 101 (5)
 * 
 * 101 (5)
 * ^ 010 (2)
 * ------
 * 111 (7)
 * 
 * 111 (7)
 * ^ 001 (1)
 * ------
 * 110 (6)
 * 
 * 110 (6)
 * ^ 010 (2)
 * ------
 * 100 (4)
 * 
 * 100 (4)
 * ^ 011 (3)
 * ------
 * 111 (7)
 * 
 * 111 (7)
 * ^ 100 (4)
 * ------
 * 011 (3)
 * 
 */