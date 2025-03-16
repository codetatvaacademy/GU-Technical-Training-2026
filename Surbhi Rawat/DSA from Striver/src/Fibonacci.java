public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        int lastD= fibo(n-1);
        int secLast = fibo(n-2);
        return lastD + secLast;
    }
}
