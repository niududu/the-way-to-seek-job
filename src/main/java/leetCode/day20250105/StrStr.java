package leetCode.day20250105;

/**
 * @Description: 找出字符串中第一个匹配项的下标
 * @Author: LiuZW
 * @CreateDate: 2025/1/5 21:54
 * @Version: 1.0
 */
public class StrStr {

    public static void main(String[] args) {
        String haystack = "XXleetcode", needle = "leetc";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
