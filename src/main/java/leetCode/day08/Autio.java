package leetCode.day08;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/10 22:56
 * @Version: 1.0
 */
public class Autio {

    public static void main(String[] args) {
        String s = "87";
        System.out.println(myAtoiImprove(s));
    }

    public static int myAtoiImprove(String s) {
        char c = s.charAt(0);
        boolean digit = Character.isDigit(c);
        return c - '1';
    }


    public static int myAtoi(String s) {
        String trim = s.trim();
        if ("".equals(trim)) {
            return 0;
        }
        String substring = trim.substring(0, 1);
        boolean flag = false;
        if (substring.equals("-") || substring.equals("+")) {
            flag = true;
            trim = trim.substring(1);
        }
        if ("".equals(trim)) {
            return 0;
        }
        char[] chars = trim.toCharArray();
        try {
            Integer.parseInt(String.valueOf(chars[0]));
        } catch (NumberFormatException e) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            try {
                Integer.parseInt(String.valueOf(chars[i]));
                sb.append(chars[i]);
            } catch (NumberFormatException e) {
                break;
            }
        }
        String result = flag ? substring + sb.toString() : sb.toString();
        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return flag && "-".equals(substring) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }

}
