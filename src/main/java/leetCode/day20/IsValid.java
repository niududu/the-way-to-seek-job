package leetCode.day20;

import java.util.Stack;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/22 22:48
 * @Version: 1.0
 */
public class IsValid {

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
    /**
     * 需要用栈 后进先出
     **/


    /**
     * '('，')'，'{'，'}'，'['，']'
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // 如果是左括号 则入栈
            if ('(' == s.charAt(i) || '[' == s.charAt(i) || '{' == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (')'== s.charAt(i) && '(' != pop) {
                    return false;
                }
                if (']'== s.charAt(i) && '[' != pop) {
                    return false;
                }
                if ('}'== s.charAt(i) && '{' != pop) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
