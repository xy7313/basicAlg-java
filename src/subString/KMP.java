package subString;

/**
 * Created by xy on 2017/1/2.
 * 在匹配成功那里加上返回值之后这个方法就只返回第一个sunstring的index
 * next是一个辅助数组，存储 子串当前匹配失败字符之前的字符串（子串的子串）的前后缀相同元素长度 ，看起来很复杂
 * 总之是利用【子串当前匹配失败字符之前的字符是匹配成功的】这一点来避免按位移动每次都重新匹配这种做法
 */
public class KMP {

    public static int[] next(String t) {
        int[] next = new int[t.length()];
        next[0] = -1;// 这里规定next[]第1个元素值为-1
        next[1] = 0;
        int j = 2;// 从给定的字符串的第3个字符(下标从0开始)开始计算next[j]数值
        while (j < t.length()) {// 从第三个字符开始逐次求解对应的next[]值
            if (next[j - 1] != 0 && t.charAt(next[j - 1]) == t.charAt(j - 1)) {// 判断Y与X是否相等（X,Y对应上图，下同）
                next[j] = next[j - 1] + 1;// 若Y与X相等，当前next[j]为上一个next[]数组值加1
                j++;// 开始自增一个字符，准备下一次求解
            } else if (t.charAt(0) == t.charAt(j - 1)) {// 若不相等，判断X与子串（模式串）第一个字符是否相同
                next[j] = 1;// 若相同，找到一个长度为1的相同前后缀，即next[j]为1
                j++;
            } else {// 若上述两个条件都不满足，即意味着没有相等的前后缀，即next[j]为0
                next[j] = 0;
                j++;
            }
        }
        return next;
    }

    public static int kmp(String s, String t) {
        int[] next = next(t);// 调用next（String t）方法
        int index = 0;
        int sLength = s.length();
        int tLength = t.length();
        if (sLength < tLength) {
            System.out
                    .println("Error.The main string is greater than the sub string length.");
            return -1;
        }
        int i = 0;
        int j = 0;
        while (i < sLength && j < tLength) {
			/*
			 * 如果j = -1， 或者当前字符匹配成功（即s.charAt(i) == t.charAt(j)）， 都令i++，j++
			 */
            if (j == -1 || s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
				/*
				 * 如果j != -1，且当前字符匹配失败， 则令 i 不变，j = next[j], next[j]即为j所对应的next值,\
				 * 比如next[j]=2,说明新的匹配从t[2]开始，前面的是匹配的
				 */
                j = next[j];
            }
        }
        if (j >= tLength) {
            index = i - j;
            System.out.println("Successful match,index is:" + index);
            return index;
        } else {// 匹配失败
            System.out.println("Match failed.");
            return -1;
        }
    }
}



