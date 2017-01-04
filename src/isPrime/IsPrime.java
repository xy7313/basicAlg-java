package isPrime;

/**
 * Created by xy on 2017/1/4.
 *cs 61B lecture5 代码改动在while。divisor<n/2即可，减少循环次数
 */
public class IsPrime {
    public static void main(String[] arg) {
        System.out.println(isPrime(43));
        System.out.println(isPrime2(43));

    }
    public static boolean isPrime(int x){
        int divisor = 2;
        while(divisor < x/2){
            if( x % divisor == 0 ) return false;
            divisor++;
        }
        return true;
    }

    public static boolean isPrime2(int n){
        for (int divisor = 2; divisor < n/2; divisor++) {
            if (n % divisor == 0) return false;
        }
        return true;
    }

}
