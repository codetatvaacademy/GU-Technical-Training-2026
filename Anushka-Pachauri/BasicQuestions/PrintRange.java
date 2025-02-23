import java.util.*;
class PrintRange{
    static void printRange(int lowerLimit,int upperLimit){
        if(upperLimit==lowerLimit){
            System.out.println(lowerLimit);
            return;
        }
        System.out.println(lowerLimit);
        printRange(lowerLimit+1,upperLimit);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit and upper limit:");
        int lowerLimit=sc.nextInt();
        int upperLimit=sc.nextInt();
        System.out.println("All numbers within the entered range are: ");
        printRange(lowerLimit,upperLimit);
    }
}