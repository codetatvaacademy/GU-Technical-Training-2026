import java.util.*;
class DifferenceOfTwo{
    static int differenceOfTwo(int num1,int num2){
       if(num1>num2){
        return (num1-num2);
       }
       if(num2>num1){
        return (num2-num1);
       }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Difference Of The Two Numbers is: "+differenceOfTwo(num1,num2));
    }
}