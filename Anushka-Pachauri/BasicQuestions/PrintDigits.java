import java.util.*;
class PrintDigits{
    static void digits(int num){
        if(num==0)
        return;
        digits(num/10);
        System.out.println(num%10);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4 digit number:");
        int num=sc.nextInt();
        if(Integer.toString(num).length()>4){
            System.out.println("Not a four digit number");
        }
        else{
        System.out.println("Digits of the number entered: ");
        digits(num);
        }
    }
}