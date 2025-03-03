import java.util.Scanner;

public class othercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        String choice;
        do {
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            System.out.println("Sum is: " + (a1+a2));
            System.out.println("Do you want to Continue (Y/N)");
            choice=sc.next();
        } while (choice.equalsIgnoreCase("Y"));
    }
}
