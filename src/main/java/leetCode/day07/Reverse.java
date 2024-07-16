package leetCode.day07;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/9 22:47
 * @Version: 1.0
 */
public class Reverse {

    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);
    }

    public static int reversePlus(int x) {
        //判断是否存在符号，将符号保留
        boolean lessFlag = false;
        if (x < 0) {
            lessFlag = true;
        }
        String temp = String.valueOf(x);
        String temps = lessFlag ? temp.substring(1) : temp;
        StringBuilder sb = new StringBuilder();
        sb.append(temps).reverse();
        String reverse = lessFlag ? "-" + sb.toString() : sb.toString();
        try {
            return Integer.parseInt(reverse);
        } catch (NumberFormatException e) {
            return 0;
        }
    }


    public static int reverse(int x) {
        /*int i1 = 2 ^ 31;
        int i2 = -2 ^ 31;
        //判断x的范围
        if (x > i1 - 1 || x < i2) {
            return 0;
        }*/
        //判断是否存在符号，将符号保留
        boolean lessFlag = false;
        if (x < 0) {
            lessFlag = true;
        }
        //顺序放到String数组中
        String temp = String.valueOf(x);
        String temps = lessFlag ? temp.substring(1) : temp;
        String[] splits = temps.split("");
        StringBuilder sb = new StringBuilder();
        //逆序放出并拼接
        for (int i = splits.length-1; i >= 0; i--) {
            sb.append(splits[i]);
        }

        String reverse = lessFlag ? "-" + sb.toString() : sb.toString();
        //转成int类型
        try {
            return Integer.parseInt(reverse);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
