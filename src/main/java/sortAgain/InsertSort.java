package sortAgain;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Description: 插入排序
 * @Author: LiuZW
 * @CreateDate: 2021/4/19 0:08
 * @Version: 1.0
 */
public class InsertSort {
    /*
    1.从第一个元素开始 该元素可以认为已经被排序
    2.取出下一个元素，在已经排序的元素序列中从后向前扫描
    3.如果该元素（已排序）大于新元素 则将该元素移到下一位置
    4.重复步骤3 直到已排序的元素小于等于新元素的位置
    5.将新元素插入到该元素位置
    6.重复2-5步骤
    从小到大排列：相当于 小的数一直不断向前移动
     */

    public static void main(String[] args) {
        int[] a = {4,3,8,6,7,5,2,9,1};
        /*
        348675291
        348675291
        346875291
        346785291
        346758291
        346752891
        346752891
        346752819
         */
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        IntStream stream1 = Arrays.stream(a);
        stream1.forEach(System.out::print);
        System.out.println();
    }



}
