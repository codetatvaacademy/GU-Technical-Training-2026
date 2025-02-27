


import java.util.Scanner;

class fourdigitprint{
    public static void main(String[] args) {
        System.out.println("enter four digit number");
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int first = a/1000;
      int remain=a%1000;
      if(remain>=0 && remain<=9)
      System.out.println("number are "+first+0+0+remain);
      else if(remain>9 && remain<100){
        
        System.out.println("number are "+first+0+remain);
      }
      else if(remain>99 && remain<1000){
       
        System.out.println("number are "+first+remain);
      }
      
    }
}