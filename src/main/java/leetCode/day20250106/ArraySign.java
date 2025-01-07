package leetCode.day20250106;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2025/1/6 23:05
 * @Version: 1.0
 */
public class ArraySign {

    public static void main(String[] args) {
        int[] ints = {-1,1,-1,1,-1};
        int i = arraySign(ints);
        System.out.println(i);
    }

    public static int arraySign(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 == nums[i]) {
                return 0;
            } else if (0 > nums[i]) {
                cnt++;
            }
        }
        if (0 == cnt % 2) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int signFunc(int i) {
        return Integer.compare(i, 0);
    }
}
