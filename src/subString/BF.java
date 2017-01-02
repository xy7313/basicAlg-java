package subString;
/**
 * Created by xy on 2017/1/2.
 */

public class BF {

    public int match(String s, String t) {
        int index = 0;// 成功匹配的位置
        int sLength = s.length();
        int tLength = t.length();
        if (sLength < tLength) {
            System.out.println("Error");
            return-1;
        }
        int i = 0;
        int j = 0;
        while (i < sLength && j < tLength) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;// 不相等时，主串回溯到上次开始匹配的下一个字符
                j = 0;// 子串从头开始重新匹配
            }
        }
        if (j >= tLength) {// 匹配成功
            index = i - j;
            return index;
        } else {
            return -1;
        }
    }
}