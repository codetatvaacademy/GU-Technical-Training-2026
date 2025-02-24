import java.util.*;
class PositiveNegativeOrZero{
    static boolean isPositive(int num){
       return (num>0);
    }
    static boolean isNegative(int num){
        return (num<0);
    }
    static boolean isZero(int num){
        return (num==0);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(isPositive(num)){
            System.out.println("Number is Positive");
        }
        else if(isNegative(num)){
            System.out.println("Number is Negative");
        }
        if(isZero(num)){
            System.out.println("Number is Zero");
        }
    }
}