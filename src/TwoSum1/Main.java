package TwoSum1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {2,7,11,15};
        Solution solution = new Solution();
        int[] result = solution.twoSum(array, 9);
        System.out.println(Arrays.toString(result));
    }
}
