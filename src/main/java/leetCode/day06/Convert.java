package leetCode.day06;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/14 23:07
 * @Version: 1.0
 */
public class Convert {

    /*
    将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
    比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
    P   A   H   N
    A P L S I I G
    Y   I   R
    14 = 4（3+3-2） + 4（3+3-2） + 4（3+3-2） + 2（3+3-2）
    a[0]      a[4]      a[8]       a[12]
    a[1] a[3] a[5] a[7] a[9] a[11] a[13]
    a[2]      a[6]      a[10]
    第一层：3+1
    第二层：3-1
    第三层：3+1
    之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
    输入：s = "PAYPALISHIRING", numRows = 4
    输出："PINALSIGYAHRPI"
    解释：
    P     I    N
    A   L S  I G
    Y A   H R
    P     I
    14 = 6（4+4-2） + 6（4+4-2） + 2
    a[0]            a[6]             a[12]
    a[1]      a[5]  a[7]      a[11]  a[13]
    a[2] a[4]       a[8]  a[10]
    a[3]            a[9]
    第一层：4+2
    第二层：4 4-2
    第三层：4-2
    第四层：4+2
    输入：s = "PAYPALISHIRING", numRows = 5
    输出："PINALSIGYAHRPI"
    解释：
    P0     H8
    A1   S7 I9
    Y2  I6  R10
    P3 L5   I11 G13
    A4     N12
    14 = 8（5+5-2） + 6
    第一层：5+3 2
    第二层：4+2 4
    第三层：4   6
    第四层：2   8
    第五层：0   10
    请你实现这个将字符串进行指定行数变换的函数：
    string convert(string s, int numRows);
    */

    /*
    到了节点位置上移
     */
    public static String convert(String s, int numRows) {
        if (s.length() < numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        // 当前行
        int curRow = 0;
        // true 表示向下 false表示向上
        boolean flag = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            rows[curRow].append(chars[i]);
            if (curRow == 0 || curRow == numRows -1) {
                flag = !flag;
            }
            curRow = flag ? curRow + 1 : curRow - 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder sb: rows) {
            stringBuilder.append(sb.toString());
        }
        return stringBuilder.toString();
    }


    public static String convertFail(String s, int numRows) {
        if (s.length() < numRows) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                // 第一层
                int temp = 0;
                int size = numRows - 2;
                while (temp < length) {
                    sb.append(chars[temp]);
                    temp = temp + numRows + size;
                }
            }
            if (i == 1) {
                // 第二层
                int temp = 1;
                int size = numRows - 4;
                while (temp < length) {
                    sb.append(chars[temp]);
                    temp = temp + numRows + size;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String paypalishiring = convert("PAYPALISHIRING", 3);
        System.out.println(paypalishiring);
    }
}
