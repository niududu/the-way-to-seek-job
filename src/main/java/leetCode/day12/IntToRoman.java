package leetCode.day12;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/15 23:27
 * @Version: 1.0
 */
public class IntToRoman {

    public static void main(String[] args) {
        int num = 58;
        //System.out.println(intToRoman(num));
        int i = 1234 / 100;
        System.out.println(i);
        int i1 = 1234 % 100;
        System.out.println(i1);
        int i2 = 1234 % 10;
        System.out.println(i2);


    }

    public static String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        Integer[] math = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < math.length) {
            if (num - math[i] >= 0) {
                num = num - math[i];
                sb.append(roman[i]);
            } else {
                i++;
            }
        }
        return sb.toString();
    }

}
