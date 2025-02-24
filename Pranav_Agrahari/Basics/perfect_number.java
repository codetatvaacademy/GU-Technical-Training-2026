import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        int a = sc.nextInt();
        int sod = 0;
        for (int i = 1; i <=a; i++) {
            if (a%i == 0) {
                sod+=i ;
            }
            int sod1 = sod-a;
            if (sod1 == a) {
                System.out.println("Perfect Number");
            }
            else{
                System.out.println("Not a Perfect number");
            }
    }
}
}
