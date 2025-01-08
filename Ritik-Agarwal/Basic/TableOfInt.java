import java.util.Scanner;
public class TableOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer to print table: ");
        int num = sc.nextInt();
        sc.close();
        for(int i=1; i<11; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}