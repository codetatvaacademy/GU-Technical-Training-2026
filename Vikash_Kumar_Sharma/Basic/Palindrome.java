import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        //int num=12212;
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sn.nextInt();
        String str=String.valueOf(num);
        String sb=new StringBuilder(str).reverse().toString();
        if(str.equals(sb)){
            System.out.println(num+" is palindrome.");
        }
        else{
            System.out.println(num+" is not palindrome");
        }
    }
}
