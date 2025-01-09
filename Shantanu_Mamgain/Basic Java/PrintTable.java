import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        for(int table = 1; table<=10 ; table++){
            System.out.println(num+" * "+table+" = "+(table*num));
        }
        sc.close();
    }
}
