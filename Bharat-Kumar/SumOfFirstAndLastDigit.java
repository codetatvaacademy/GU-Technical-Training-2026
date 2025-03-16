import java.util.*;
public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int temp = digit;
        int sum =0;
        for(int i=0;i<3;i++){
            if(i==1){
                temp/=10;
            }
            int a = temp%10;
            sum+=a;
            temp/=10;
        }
        System.out.println(sum);
    }
}
