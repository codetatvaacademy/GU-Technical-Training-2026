import java.util.Scanner;
public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        printFirst(n);
        printSecond(n);
        printThird(n);
        printFourth(n);
        printFifth(n);
        printSixth(n);
        printSeventh(n);
    }
    private static void printFirst(int n){
        System.out.print("1");
        int x = 1;
        for(int i=2; i<=n; i++){
            x+=i;
            System.out.print(", " + x);
        }
        System.out.println();
    }
    private static void printSecond(int n){
        int x = 1;
        System.out.print(x);
        for(int i=1; i<n; i++){
            x*=10;
            x++;
            System.out.print(", " + x);
        }
        System.out.println();
    }
    private static void printThird(int n){
        int x = 1;
        System.out.print(x);
        for(int i=2; i<=n; i++){
            x*=10;
            x+=i;
            System.out.print(", " + x);
        }
        System.out.println();
    }
    private static void printFourth(int n){
        System.out.print("0");
        for(int i=2; i<=n; i++){
            System.out.print(", " + (i*i*i-1));
        }
        System.out.println();
    }
    private static void printFifth(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + ", " + b);
        for(int i=2; i<n; i++){
            int c = a+b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
    private static void printSixth(int n){
        int x = 1;
        System.out.print("0, " + x);
        for(int i=0; i<n; i++){
            x = x+x+1;
            System.out.print(", " + x);
        }
        System.out.println();
    }
    private static void printSeventh(int n){
        int ans = n;
        System.out.print(n);
        for(int i=2; i<=n; i++){
            if(i%2==0){
                ans -= (int)Math.pow(n,i);
                System.out.print(" - " + n + "^" + i);
            }
            else{
                ans += (int)Math.pow(n,i);
                System.out.print(" + " + n + "^" + i);
            }
        }
        System.out.println(" = " + ans);
    }
}