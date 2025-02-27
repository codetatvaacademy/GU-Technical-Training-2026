

import java.util.Scanner;



public class squarecube {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.println("cube is"+a*a*a);
        System.out.println("square is"+a*a);
    }
}
