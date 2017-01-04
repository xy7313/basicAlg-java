package isPrime;

/**
 * Created by xy on 2017/1/4.
 *cs 61B lecture5 isPrime方法代码改动在while。divisor * divisor <= n即可，减少循环次数，后面课件里也提到了这点
 */
public class IsPrime {
    public static void main(String[] arg) {
        int n = 37;
        System.out.println(isPrime(n));
        System.out.println(isPrime2(n));
        printPrimes(n);
        printPrimesBetter(n);

    }
    public static boolean isPrime(int x){
        int divisor = 2;
        while(divisor * divisor <= x){
            if( x % divisor == 0 ) return false;
            divisor++;
        }
        return true;
    }

    public static boolean isPrime2(int n){
        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (n % divisor == 0) return false;
        }
        return true;
    }

    //Notice: i <= n,or it will not print the last prime
    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)) System.out.println(" "+i);
        }
    }

    //从1-n的prime，包括n，和leetcode上不同
    public static void printPrimesBetter(int n){
        boolean[] prime = new boolean[n+1];
        for(int i = 2; i <= n; i++){
            prime[i]=true;
        }
        //原课件 inner for loop：for (i = 2 * divisor; i <= n; i = i + divisor) ，但这里可以从divisor开始而不从2开始，因为2已经都算过了
        for(int divisor = 2; divisor * divisor <= n; divisor++){
            if(prime[divisor]){
                for(int j = divisor*divisor; j<=n; j+=divisor){
                    prime[j]=false;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(prime[i]) System.out.print(" "+i);
        }
    }

}
