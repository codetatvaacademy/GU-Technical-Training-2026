package java_practice_questions;


import java.util.Scanner;



class oneand3sum{
    public static void main(String[] args) {
        System.out.println("enter three digit number");
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int first = a/100;
      int third= a%10;
      int sum =first+third;
      System.out.println("sum is"+sum);
    }
}
