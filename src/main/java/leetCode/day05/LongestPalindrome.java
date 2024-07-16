package leetCode.day05;

import java.util.*;

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

    public static String longestPalindrome(String s) {
        List<String> objects = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] splits = s.split("");
        for (int i = 0; i < splits.length; i++) {
            if (hashMap.containsKey(splits[i])) {
                objects.add(s.substring(hashMap.get(splits[i]), i + 1));
            } else {
                hashMap.put(splits[i], i);
            }
        }
        return objects.isEmpty() ? splits[0]: objects.stream().max(Comparator.comparing(String::length)).get();
    }

}
