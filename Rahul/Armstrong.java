import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
        //Function to check whether armstrong or not
        static boolean is(int n){
            int temp,digits=0,last=0,sum=0;
            //assign n into a temp var
            temp=n;
            //loop execute until the condition become false
            while (temp>0) {
                temp=temp/10;
                digits++;   
            }
            temp=n;
            while (temp>0) {
                //determine the last digit from the no
                last= temp%10;
                //calculate last digit numb;
                sum+=(Math.pow(last, digits));
                //remove the last digit
                temp=temp/10;                
            }
            //compare the sum with n
            if(n==sum) 
            //returns if sum and n are equal
            return true;
            //return false if sum and n are not equal
            else return false; 
        }
        //drive code
        public static void main(String[] args) {
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            //reads the limit from the user
            num=sc.nextInt();
            if(is(num)){
                System.out.println("Armstrong");
            }else{
                System.out.println("Not Armstrong");
            }
        }



        }  
        
       
    
    

