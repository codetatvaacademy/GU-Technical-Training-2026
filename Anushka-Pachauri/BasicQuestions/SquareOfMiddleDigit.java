import java.util.*;
class SquareOfMiddleDigit{
    static int square(int num){
        return ((num/10)%10)*((num/10)%10);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3 digit number:");
        int num=sc.nextInt();
        if(Integer.toString(num).length()>3){
            System.out.println("Not a three digit number");
        }
        else{
        System.out.println("Square of the middle digit: "+square(num));
        }
    }
}