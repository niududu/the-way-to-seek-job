package leetCode.day17;

import java.util.*;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/21 22:14
 * @Version: 1.0
 */
public class LetterCombinations {

    public static void main(String[] args) {
        String s = "23";
        //List<String> strings = letterCombinations(s);
        //strings.forEach(System.out::println);

        List<String> strings1 = Arrays.asList("a", "b", "c");
        List<String> strings2 = Arrays.asList("d", "e", "f");
        strings1.forEach(s1 -> {
            strings2.forEach(s2 -> {
                System.out.println(s1+s2);
            });
        });
    }

    public static List<String> letterCombinations(String digits) {
        HashMap<String, List<String>> numberLetterMap = new HashMap<>();
        numberLetterMap.put("2", Arrays.asList("a", "b", "c"));
        numberLetterMap.put("3", Arrays.asList("d", "e", "f"));
        numberLetterMap.put("4", Arrays.asList("g", "h", "i"));
        numberLetterMap.put("5", Arrays.asList("j", "k", "l"));
        numberLetterMap.put("6", Arrays.asList("m", "n", "o"));
        numberLetterMap.put("7", Arrays.asList("p", "q", "r", "s"));
        numberLetterMap.put("8", Arrays.asList("t", "u", "v"));
        numberLetterMap.put("9", Arrays.asList("w", "x", "y", "z"));
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        List<List<String>> allLetterList = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            String substring = digits.substring(i, i + 1);
            allLetterList.add(numberLetterMap.get(substring));
        }
        allLetterList.forEach(letterList->{
            letterList.forEach(letter->{
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(letter);
            });
        });
        return null;
    }
}
