package khj.study;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,8,11,21};
        int target =10;
        TwoSum a = new TwoSum();
        int[]  result = a.solve(nums, target);
        for(int i : result)
            System.out.println(i);
    }

    //
    public int[] solve(int[] nums, int target) {
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i+1] == target) {
                result.add(i + 1);
                result.add(i + 2);
            }
        }

        int[] test = new int[result.size()];
        int j = 0;
        for (Integer i: result) {
            test[j++] = i;
        }


        return test;
    }
}
