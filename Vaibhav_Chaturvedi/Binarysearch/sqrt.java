package Binarysearch;

import java.util.Scanner;

class sqrt {
    public static int mySqrt(int x) {
            int min =1;
            int max= x;
            while(min<=max){
                int mid = (min+max)/2;
                if(x/mid > mid){
                    min= mid+1;
                }
                else if(x/mid < mid){
                  max= mid-1;
                }
                else{
                return mid;
                }
            }
            return max;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                System.out.println("enter value");
                int num = sc.nextInt();
                int ans = mySqrt( num);
                System.out.println(ans);
    }
} 