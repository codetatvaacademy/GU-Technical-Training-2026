import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n%2==0){
            System.out.println(n +  " is even number.");
        }
        else{
            System.out.println(n + " is odd number.");
        }
    }
}