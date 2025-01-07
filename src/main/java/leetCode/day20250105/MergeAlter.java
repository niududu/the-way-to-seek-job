package leetCode.day20250105;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2025/1/5 16:02
 * @Version: 1.0
 */
public class MergeAlter {

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String s = mergeAlternately1(word1, word2);
        System.out.println(s);
    }

    /*
    输入：word1 = "abc", word2 = "pqr"
    输出："apbqcr"
    解释：字符串合并情况如下所示：
    word1：  a   b   c
    word2：    p   q   r
    合并后：  a p b q c r
     */
    public static String mergeAlternately(String word1, String word2) {

        int min;
        String sub;
        if (word1.length() >= word2.length()) {
            min = word2.length();
            sub = word1.substring(min);
        } else {
            min = word1.length();
            sub = word2.substring(min);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < min; i++) {
            stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return stringBuilder.append(sub).toString();
    }

    /*
    双指针
     */
    public static String mergeAlternately1(String word1, String word2) {

        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                result.append(word2.charAt(j));
                j++;
            }
        }
        return result.toString();
    }
}
