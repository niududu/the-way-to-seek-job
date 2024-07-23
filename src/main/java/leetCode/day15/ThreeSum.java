package leetCode.day15;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/21 13:33
 * @Version: 1.0
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(a);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<Set<Integer>> allSetResults = new HashSet<>();
        List<List<Integer>> allResults = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    break;
                }
                for (int k = 0; k < nums.length; k++) {
                    if (k == i || k == j) {
                        break;
                    }
                    if (-c == nums[j] + nums[k]) {
                        Set<Integer> results = new TreeSet<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        if (!allSetResults.contains(results)) {
                            allSetResults.add(results);
                            allResults.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        }
        return allResults;
    }

}
