package sort;

/**
 * @Description: 选择排序
 * @Author: LiuZW
 * @CreateDate: 2020/8/18 20:59
 * @Version: 1.0
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {7, 5, 4, 8, 3, 9};
        int minPos = findMinPos(array);
        System.out.println(minPos);
        //sort1(array);
        sort(array);
    }

    /***
     * 选择排序 时间复杂度极大 O(n^2) 且不稳定
     *  原理：遍历数据取最小值==》获取其下标与第一个元素互换位置 ==》取次小值与第二个元素互换位置 。。最后遍历结束
     *      [7,5,4,8,3,9]
     *      -->[3,5,4,8,7,9]
     *      -->[3,4,5,8,7,9]
     *      -->[3,4,5,8,7,9]
     *      -->[3,4,5,7,8,9]
     *      -->[3,4,5,7,8,9]
     *      -->[3,4,5,7,8,9]
     */

    private static void sort1(int[] nums) {
        /*
        查找第一次便利后的最小值的下标与0的调换结果
         */
        int minPos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minPos]) {
                minPos = i;
            }
        }
        System.out.println("minPos:" + minPos);
        int temp = nums[0];
        nums[0] = nums[minPos];
        nums[minPos] = temp;
    }

    private static void sort(int[] nums) {
        /*
        之后都是按查找第一次便利后的最小值的下标与0的调换结果
         */
        for (int j = 0; j < nums.length - 1; j++) {
            int minPos = j;
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[i] < nums[minPos]) {
                    minPos = i;
                }
            }
            System.out.println("minPos:" + minPos);
            int temp = nums[j];
            nums[j] = nums[minPos];
            nums[minPos] = temp;
            System.out.print("第" + j + "次循环之后的结果为:");
            print(nums);
            System.out.println("");
        }

    }

    public static void print(int[] array){
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    private static int findMinPos(int[] nums) {
        //找到最小值的下标
        int minPos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[0]) {
                minPos = i;
            }
        }
        return minPos;
    }

}
