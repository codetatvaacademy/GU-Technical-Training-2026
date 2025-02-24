import java.util.*;
class PrintEvenRange{
    static void printEvenRange(int lowerLimit,int upperLimit){
        if(upperLimit==lowerLimit && lowerLimit%2==0){
            System.out.println(lowerLimit);
            return;
        }
        if(lowerLimit%2==0){
            System.out.println(lowerLimit);
        }
        printEvenRange(lowerLimit+1,upperLimit);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit and upper limit:");
        int lowerLimit=sc.nextInt();
        int upperLimit=sc.nextInt();
        System.out.println("All even numbers within the entered range are: ");
        printEvenRange(lowerLimit,upperLimit);
    }
}