import java.util.*;
class SumOfFirstAndThird{
    static int sum(int num){
        return (num%10)+(num/100);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3 digit number:");
        int num=sc.nextInt();
        if(Integer.toString(num).length()>3){
            System.out.println("Not a three digit number");
        }
        else{
        System.out.println("Sum of first and third digit: "+sum(num));
        }
    }
}