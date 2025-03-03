import java.util.Scanner;

public class P4_Rupee_Paisa_Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Rupee :: ");
        int rupee = sc.nextInt();

        // Change to paisa by using rs * 100
        System.out.println("Paisa is " + rupee * 100);
    }
}
