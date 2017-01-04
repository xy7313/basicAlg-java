package recursiveAndReturn;

/**
 * Created by xy on 2017/1/4.
 */
public class recurReturn {
    public static void main(String[] arg) {
        oneToX(10);
    }

    //输出顺序是从1-10，recursive 很神奇的一点
    public static void oneToX(int x) {
        if (x < 1) {
            return;
        }                   //  These two code fragments
        oneToX(x - 1);
        System.out.println(x);
    }

}



