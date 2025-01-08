import java.util.Scanner;

public class perfectnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i= 1;i<num;i++){
            if(num%i==0){
                sum = sum+i;

            }
        }
            if(sum==num){
                System.out.println("the number is a perfect num");
            }
            else
            System.out.println("the num is not a perfect num");
        
    }
}