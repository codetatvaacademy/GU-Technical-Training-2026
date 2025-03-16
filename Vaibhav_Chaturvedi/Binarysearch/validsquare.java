package Binarysearch;
import java.util.*;
class  validsquare {
    public static boolean isPerfectSquare(int num) {
            
            long min = 1;
            long max = num;
            while(min<=max){
                long mid = (min+max)/2;
            if(mid*mid<num){
                min=mid+1;
            }
            else if(mid*mid > num){
                max=mid-1;
            }
            else{
                return true;
            }
            }
            return false;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value");
            int num = sc.nextInt();
            boolean ans = isPerfectSquare( num);
            System.out.println(ans);
    }
} 