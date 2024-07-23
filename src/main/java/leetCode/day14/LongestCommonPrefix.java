package leetCode.day14;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/18 22:55
 * @Version: 1.0
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(strings);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
