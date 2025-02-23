import java.util.*;
class LargestOfTwo{
    static int largestOfTwo(int num1,int num2){
       return Math.max(num1,num2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Largest Of The Two Numbers is: "+largestOfTwo(num1,num2));
    }
}