package leetCode.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/17 23:07
 * @Version: 1.0
 */
public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }


    public static int romanToInt(String s) {
        int sum = 0;
        Integer preValue =0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('M', 1000);
        hashMap.put('D', 500);
        hashMap.put('C', 100);
        hashMap.put('L', 50);
        hashMap.put('X', 10);
        hashMap.put('V', 5);
        hashMap.put('I', 1);
        for (int i = s.length() - 1; i >= 0; i--) {
            Integer curValue = hashMap.get(s.charAt(i));
            if (curValue > preValue) {
                sum = sum + curValue;
            } else {
                sum = sum - curValue;
            }
            preValue = curValue;
        }
        return sum;

    }

}
