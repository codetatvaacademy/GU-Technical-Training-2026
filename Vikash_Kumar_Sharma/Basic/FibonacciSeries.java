public class FibonacciSeries {
    public static int fib(int num){
        if(num<=1)
            return 1;
            int a=0;
            int b=1;
            for(int i=2;i<=num;i++){
                int temp=b;
                b=a+b;
                a=temp;

            }
            return b;
        }
    public static void main(String[] args) {
        System.out.println("Fibonacci series is "+fib(10)+"of "+fib);

    }
}
