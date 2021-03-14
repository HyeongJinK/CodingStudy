package khj.study;

import java.util.ArrayList;

public class MoveZeros {
    public static void main(String args[]) {
        int[] nums = { 0, 3, 2, 0, 8, 5 };
        int zeroCount = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int num: nums) {
            if (num != 0) {
                result.add(num);
            } else {
                ++zeroCount;
            }
        }

        while (--zeroCount >= 0) {
            result.add(0);
        }

        System.out.println(result);
    }
}
