import java.util.Scanner;
public class IsPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int div=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                div+=i;
            }
        }
        System.out.println(div);
        if(div==n){
            System.out.println(n + " is a perfect number.");
        }
        else{
            System.out.println(n + " is not a perfect number.");
        }
    }
}