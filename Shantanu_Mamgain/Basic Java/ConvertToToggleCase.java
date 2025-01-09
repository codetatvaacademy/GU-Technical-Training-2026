import java.util.Scanner;

public class ConvertToToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any alphabet: ");
        char ch = sc.next().charAt(0);

        //First way to toggle character
        if(ch>='a' && ch<='z'){
            System.out.println("Toggle case is: "+Character.toUpperCase(ch));
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Toggle case is: "+Character.toLowerCase(ch));
        }

        //Second way to toggle character
        if(ch>='a' && ch<='z'){
            char capitalize = (char)(ch-32);
            System.out.println("Toggle case is: "+capitalize);
        }
        else if(ch>='A' && ch<='Z'){
            char lower = (char)(ch+32);
            System.out.println("Toggle case is: "+lower);
        }


        sc.close();
    }
}
