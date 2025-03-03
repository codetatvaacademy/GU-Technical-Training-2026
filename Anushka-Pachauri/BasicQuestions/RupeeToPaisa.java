import java.util.*;
class RupeeToPaisa{
    static int toPaisa(int rupee){
        return rupee*100;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount ib Rupees:");
        int rupee=sc.nextInt();
        System.out.println("Amount in Paisa: "+toPaisa(rupee));
    }
}