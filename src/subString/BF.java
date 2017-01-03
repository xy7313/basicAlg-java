package subString;
/**
 * Created by xy on 2017/1/2.
 * main idea：从主串的第一个字符起与子串的第一个字符进行比较，若相等，则继续逐对字符进行后续的比较；
 * 若不相等，则从主串第二个字符起与子串的第一个字符重新比较，
 * 以此类推，直到子串中每个字符依次和主串中的一个连续的字符序列相等为止，此时称为匹配成功
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