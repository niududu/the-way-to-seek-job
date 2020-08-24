package sort;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2020/8/24 22:42
 * @Version: 1.0
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {9, 3, 5, 7, 6, 1, 2, 8, 4};
        sort(array);
        print(array);
    }

    private static void sort(int[] array) {

        for (int gap = array.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i; j > gap-1; j -= gap) {
                    swap(array, j, j - gap);
                }
            }
        }


    }

    private static void swap(int[] array, int i, int j) {
        if (array[i] < array[j]) {
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
