import java.util.*;
public class fourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();   
        if(digit<1000 || digit>9999){
            System.out.println("Invalind");
        }
        while(digit>0){
            int rem = digit%10;
            System.out.print(rem+" ");
            digit/=10;
        }
    }
}
