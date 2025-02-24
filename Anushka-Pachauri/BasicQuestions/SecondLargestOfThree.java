import java.util.*;
class SecondLargestOfThree{
    static int secondLargestOfThree(int num1,int num2,int num3){
        int secondLargest=0;
        if(num1>=num2 && num1>=num3){
            secondLargest=(num2>=num3)?num2:num3;
        }
        else if(num2>=num1 && num2>=num3){
            secondLargest=(num1>=num3)?num1:num3;
        }
        else if(num3>=num1 && num3>=num2){
            secondLargest=(num2>=num1)?num2:num1;
        }
        return secondLargest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("2nd Largest Of The Three Numbers is: "+secondLargestOfThree(num1,num2,num3));
    }
}