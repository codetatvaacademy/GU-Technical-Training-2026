import java.util.Scanner;

public class ValidPerfectSquare{
        public boolean isPerfectSquare(int num) {
         long min =1;
         long max=num;
        while(min<=max){
            long mid = (min+max)/2;
         if(mid*mid==num){
            return true;
         }
         else if(mid*mid<num){
            min = mid+1;
         }
         else{
            max=mid-1;
         }
         }
    
         return false;
        }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ValidPerfectSquare vs = new ValidPerfectSquare();
        boolean result = vs.isPerfectSquare(num);

        System.out.println(result);
    }
}
