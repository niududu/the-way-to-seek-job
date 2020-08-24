package sort;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2020/8/24 22:14
 * @Version: 1.0
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {9,6,1,3,5};
        sort(array);
        print(array);
    }

    private static void print(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }


    }


}
