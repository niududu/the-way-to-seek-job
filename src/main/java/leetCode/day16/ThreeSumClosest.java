package leetCode.day16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/21 14:43
 * @Version: 1.0
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        System.out.println(threeSumClosest1(nums, 1));
    }

    public static int threeSumClosest1(int[] nums, int target) {
        Arrays.sort(nums);
        int closeNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - closeNum)) {
                    closeNum = sum;
                }
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    return sum;
                }
            }
        }
        return closeNum;
    }

    public static int threeSumClosest(int[] nums, int target) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sub = target - (nums[i] + nums[j] + nums[k]);
                    // 距离
                    int abs = Math.abs(sub);
                    if (abs == 0) {
                        return nums[i] + nums[j] + nums[k];
                    }
                    treeMap.put(abs, nums[i] + nums[j] + nums[k]);
                }
            }
        }
        return treeMap.get(treeMap.firstKey());
    }
}
