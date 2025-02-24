import java.util.Scanner;

public class ArrangeCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(arrangeCoins(n));
    }
    private static int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        while(start<=end){
            long mid = (start+end)/2;
            if((mid*(mid+1)/2)>n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return (int)end;
    }
}
