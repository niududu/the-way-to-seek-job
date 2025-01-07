package leetCode.day20250105;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2025/1/5 16:18
 * @Version: 1.0
 */
public class FindTheDifference {

    public static void main(String[] args) {
        String a = "ae";
        String b = "aea";
        char theDifference = findTheDifference(a, b);
        System.out.println(theDifference);
    }

    /*
    "ae" "aea" ==> "a"
     */
    public static char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }

}
