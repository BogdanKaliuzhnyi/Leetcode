package TwoSum1;

import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if(map.containsKey(b)) {
                int j = map.get(b);
             return new int[] {i, j};
            }
            map.put(a, i);
        }
        return null;
    }
}