package leetCode.day05;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/8 23:17
 * @Version: 1.0
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "cbab";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }

    /*
            示例 1：

        输入：s = "babad"
        输出："bab"
        解释："aba" 同样是符合题意的答案。
        示例 2：

        输入：s = "cbbd"
        输出："bb"
     */
    public static String longestPalindrome(String s) {

        int n = s.length();
        Boolean[][] booleans = new Boolean[n][n];
        // 对角线赋值为true
        for (int i = 0; i < n; i++) {
            booleans[i][i] = true;
        }
        // 长度为2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                booleans[i][i + 1] = true;
            } else {
                booleans[i][i + 1] = false;
            }
        }
        // 长度大于3
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < n - 3; j++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                }
            }
        }
        return "";
    }

}