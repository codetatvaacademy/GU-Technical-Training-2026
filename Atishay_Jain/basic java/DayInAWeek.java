package Atishay_Jain;

import java.util.*;

public class DayInAWeek {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        if(n>32){
            System.out.print("Invalid number");
        }        
        else if(n%7==0){
            System.out.println("Monday");
        }
        else if(n%7==1){
            System.out.println("Tuesday");
        }
        else if(n%7==2){
            System.out.println("Wednesday");
        }
        else if(n%7==3){
            System.out.println("Thursday");
        }
        else if(n%7==4){
            System.out.println("Friday");
        }
        else if(n%7==5){
            System.out.println("Saturday");
        }
        else if(n%7==6){
            System.out.println("Sunday");
        }

    }
}
