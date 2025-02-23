//WAP to check whether a number is even or odd.

import java.util.*;
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number%2==0 || number == 0){
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd");
        }

        sc.close();
    }

}
