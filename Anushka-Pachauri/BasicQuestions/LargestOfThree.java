import java.util.*;
class LargestOfThree{
    static int largestUsingNestedIf(int num1,int num2,int num3){
        int largest=0;
        if(num1>=num2){
            if(num1>=num3){
                largest=num1;
            }
        }
        else if(num2>=num1){
            if(num2>=num3){
                largest=num2;
            }
        }
        else if(num3>=num1){
            if(num3>=num2){
                largest=num3;
            }
        }
        return largest;
    }
    static int largestUsingAND(int num1,int num2,int num3){
        int largest=0;
        if(num1>=num2 && num1>=num3){
                largest=num1;
        }
        else if(num2>=num1 && num2>=num3){
                largest=num2;
        }
        else if(num3>=num1 && num3>=num2){
            largest=num3;
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("Largest Of The Three Numbers Using Nested if is: "+largestUsingNestedIf(num1,num2,num3));
        System.out.println("Largest Of The Three Numbers Using AND Operator is: "+largestUsingAND(num1,num2,num3));
    }
}