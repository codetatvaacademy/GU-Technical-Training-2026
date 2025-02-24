import java.util.*;
class LeapYear{
    static boolean isLeap(int year){
       return ((year%4==0 && year%100!=0) || (year%400==0));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year(eg: 2024):");
        int year=sc.nextInt();
        if(isLeap(year)){
            System.out.println("Entered Year is Leap");
        }
        else{
            System.out.println("Entered Year is not Leap");
        }
    }
}