package leetCode.day20250106;

import java.util.Arrays;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2025/1/6 23:18
 * @Version: 1.0
 */
public class MakeArithmeticProgression {

    public static void main(String[] args) {
        int[] ints = {3, 5, 2};
        boolean b = canMakeArithmeticProgression(ints);
        System.out.println(b);
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 3) {
            return true;
        }
        Arrays.sort(arr);
        int same = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            int j = i + 1;
            if (same != arr[j] - arr[i]) {
                return false;
            }
        }
        return true;
    }

}
