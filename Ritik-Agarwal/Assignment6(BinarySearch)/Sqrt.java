import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println(mySqrt(x));
    }
    private static int mySqrt(int x) {
        long start = 1;
        long end = x;
        while(start<=end){
            long mid = (start+end)/2;
            if(mid*mid>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return (int)end;
    }
}
