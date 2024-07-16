package leetCode;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2020/8/18 16:44
 * @Version: 1.0
 */
public class DayOne {

    public static void main1(String[] args) {
        int[] nums = {0, 1, 2, 2, 33, 33, 56, 87, 99, 99};
        int i = removeDuplicates(nums);
        System.out.println(i);
        for (int a = 0; a < i; a++) {
            System.out.print(nums[a]);
        }
        System.out.println("");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a]);
        }
    }

    /**
     * 给定数组 nums = [1,1,2],
     * <p>
     * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
     * <p>
     * 你不需要考虑数组中超出新长度后面的元素。
     */
    /**
     * @MethodName: removeDuplicates
     * @Description: 删除排序数组中的重复项
     * @Param: [nums]
     * @Return: int
     * @Author: LiuZW
     * @Date: 2020/8/18 16:53
     **/
    private static int removeDuplicates(int[] nums) {

        int length = 1;
        if (null == nums || 0 == nums.length) {
            return 0;
        }
        if (1 == nums.length) {
            return 1;
        }
        //定义
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp == nums[i]) {
                continue;
            } else {
                temp = nums[i];
                //将不同的元素往前提
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }


    private static int maxProfit(int[] prices) {
        return 0;
    }


    public static void mainRemoveDuplicatesAgain(String[] args) {
        int[] nums = {1, 1, 1, 2};
        int i = removeDuplicatesAgain(nums);
        System.out.println("length:" + i);
        for (int a : nums) {
            System.out.println(a);
        }

    }

    /**
     * @MethodName: removeDuplicatesAgain
     * @Description: 向更高的世界探索吧
     * @Param: [nums]
     * @Return: int
     * @Author: LiuZW
     * @Date: 2022/2/22 22:35
     **/
    private static int removeDuplicatesAgain(int[] nums) {
        /*
        已知nums是有序的数组
        可以采用双端指针的处理方式
        一个快指针进行遍历
        一个慢指针进行对相同元素的阶段下标进行覆盖
         */
        int length = nums.length;
        if (length == 1) {
            return 1;
        }
        int slow = 1;
        for (int fast = 1; fast < length; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4};
        int i = removeElement(nums, 1);
        System.out.println("length:" + i);
        for (int a : nums) {
            System.out.println(a);
        }
    }

    /**
     * @MethodName: removeElement
     * @Description: 在试试
     * @Param: [nums, val]
     * @Return: int
     * @Author: LiuZW
     * @Date: 2022/2/23 0:18
     **/
    public static int removeElement(int[] nums, int val) {

        int length = nums.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            if (val != nums[i]) {
                nums[temp] = nums[i];
                temp++;
            }
        }
        return temp;
    }
}
