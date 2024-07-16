package leetCode.day03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/7 23:35
 * @Version: 1.0
 */
public class lengthOfLongestSubstring {

    public static void main(String[] args) {
        String a = "pwwke";
        // 输出子串
        List<String> allSubs = getAllSubs(a);
        allSubs.forEach(System.out::println);
        String s = allSubs.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(s);
    }

    private static boolean duplicateString(String a) {
        HashSet<String> hashSet = new HashSet<>();
        String[] splits = a.split("");
        for (String split: splits) {
            if (!hashSet.add(split)) {
                return false;
            }
        }
        return true;
    }

    private static List<String> getAllSubs(String a) {
        List<String> subs = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                String substring = a.substring(i, j);
                if (duplicateString(substring) && !subs.contains(substring)) {
                    subs.add(substring);
                }
            }
        }
        return subs;
    }
}
