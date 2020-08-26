package sort;

import java.util.Arrays;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2020/8/26 22:42
 * @Version: 1.0
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 10, 2, 3, 5, 8, 9};
        //merge(array,2,5,8);
        sort(array,0,9);
        print(array);
    }

    private static void sort(int[] array,int left,int right) {
        if(left == right) return ;
        int mid = left+ (right-left)/2;
        sort(array,left,mid);
        sort(array,mid+1,right);
        merge(array, left, mid+1, right);

    }

    private static void merge(int[] array,int leftPtr,int rightPre,int rightBound) {
        int length = rightBound - leftPtr + 1;
        int[] target = new int[length];
        int i = leftPtr;
        int mid = rightPre - 1 ;
        int j = rightPre;
        int k = 0;
            while (i <= mid && j <= rightBound) {
                if (array[i] <= array[j]) {
                    target[k] = array[i];
                    i++;
                } else {
                    target[k] = array[j];
                    j++;
                }
                k++;
            }
            while (i <= mid && k < length) {
                target[k] = array[i];
                k++;
                i++;
            }
            while ( j< array.length && k < length) {
                target[k] = array[j];
                k++;
                j++;
            }
        for (int l = 0; l < target.length; l++) {
            array[leftPtr+l] = target[l];
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (array[i] > array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private static void print(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
