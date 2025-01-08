import java.util.Scanner;
public class PrintInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        sc.close();
        for(int i= lower+1; i<upper; i++){
            System.out.print(i + " ");
        }
    }
}