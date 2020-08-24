package sort;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2020/8/24 21:45
 * @Version: 1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 3, 5, 7, 6, 1, 2, 8, 4};
        sort(array);
        print(array);
    }

    private static void print(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    private static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                swap(array, j,j+1);
            }
        }
    }

    private static void swap(int[] array, int i,int j) {
        if (array[i] > array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }


}
