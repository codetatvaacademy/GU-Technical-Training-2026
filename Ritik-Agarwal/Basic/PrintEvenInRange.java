import java.util.Scanner;
public class PrintEvenInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        sc.close();
        for(int i= lower+1; i<upper; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }            
        }
    }
}