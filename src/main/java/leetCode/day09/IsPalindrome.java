package leetCode.day09;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/11 22:51
 * @Version: 1.0
 */
public class IsPalindrome {

    public static void main(String[] args) {
        int s = 1234;
        int i = s / 10 /10;
        // 个位 余数
        int a = s % 10;
        // 十位 余数
        int b = s / 10 % 10;
        // 百位 余数
        int c = s / 10 / 10 % 10;
        // 千位 余数
        int d = s / 10 / 10 / 10 % 10;
        int sum = d * 1000 + c * 100 + b * 10 + a;
        int palindromeNum = a * 1000 + b * 100 + c * 10 + d;
        int e = 4/10;
        System.out.println(e);
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(sum);
        System.out.println(palindromeNum);
    }

    public static boolean isPalindromeImprove(int x) {
        //
        while (x / 10 > 0) {
            x = x / 10;

        }

        return false;
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        String ori = sb.toString();
        StringBuilder reverse = sb.reverse();
        String target = reverse.toString();
        System.out.println(ori);
        System.out.println(target);
        return ori.equals(target);
    }
}
