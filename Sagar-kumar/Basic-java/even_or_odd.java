import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
      
        System.out.println("Enter a no");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("the no is even");
        }
        else 
        System.out.println("the no is odd");
    }
}
