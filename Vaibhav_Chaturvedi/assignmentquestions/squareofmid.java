


import java.util.Scanner;

class squareofmid{
    public static void main(String[] args) {
        System.out.println("enter three digit number");
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int remain = a%100;
      if(remain>=0 && remain<=9)
      System.out.println("square is"+0);
      else{
        int  number= remain/10;
        System.out.println("square is"+number*number);
      }
      
      
    }
}
