import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum=0;
        for(int range=1; range<num; range++ ){
            if(num%range==0){
                sum += range;
            }
        }
        
        if(sum==num){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
        sc.close();
    }
}
