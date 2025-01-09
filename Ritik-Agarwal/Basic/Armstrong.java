import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int arm = 0;
        while(temp!=0){
            int rem = temp%10;
            arm += rem*rem*rem;
            temp/=10;
        }
        if(arm==n){
            System.out.println(n + " is an armstrong number.");
        }
        else{
            System.out.println(n + " is not an armstrong number.");
        }
    }
}