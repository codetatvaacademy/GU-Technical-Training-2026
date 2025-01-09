import java.util.Scanner;
public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int sum_a=sc.nextInt();
     int digit_1 = sum_a/100;
     int digit_3 = sum_a%10;
     int sum_of_these_no =digit_1 + digit_3;
     System.out.println(sum_of_these_no);
    
   
}

