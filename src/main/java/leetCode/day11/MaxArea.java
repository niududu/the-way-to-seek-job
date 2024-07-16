package leetCode.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/15 22:21
 * @Version: 1.0
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        //int[] height = new int [] {1,1};
        //System.out.println(maxArea(height));
        System.out.println("maxAreaImprove" + maxAreaImprovePlus(height));
    }

    /***
     * 双重指针
     * @param height
     * @return
     */
    public static int maxAreaImprovePlus(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int min = Math.min(height[left], height[right]);
            int area = min * (right - left);
            maxArea = Math.max(maxArea, area);
            System.out.println("" + area + "_" + maxArea);
            while (height[left] <= min && left < right) {
                left++;
            }
            while (height[right] <= min && left < right) {
                right--;
            }
        }
        return maxArea;
    }

    public static int maxAreaImprove(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            System.out.println("" + area + "_" + maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static int maxArea(int[] height) {
        int a, b;
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                a = Math.min(height[i], height[j]);
                b = j - i;
                int temp = a * b;
                System.out.print(temp + " ");
                area = Math.max(temp, area);
                System.out.println(area);
            }
        }
        return area;
    }

}
