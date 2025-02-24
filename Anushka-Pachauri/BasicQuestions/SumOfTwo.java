import java.util.*;
class SumOfTwo{
    static int sum(int num1, int num2){
        return num1+num2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Sum="+sum(num1,num2));
    }
}