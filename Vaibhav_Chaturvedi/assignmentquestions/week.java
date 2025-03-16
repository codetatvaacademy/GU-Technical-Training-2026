
import java.util.*;
import java.util.Scanner;



class week{
    public static void main(String[] args) {
        System.out.println("enter three digit number");
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      switch (a) {
            case 1:{
                System.out.println("monday");}
                break;
                case 2:{
                    System.out.println("tuesday");}
                    break;
                    case 3:{
                        System.out.println("wednesday");}
                        break;
                        case 4:{
                            System.out.println("thursday");}
                            break;
                            case 5:{
                                System.out.println("friday");}
                                break;
                                case 6:{
                                    System.out.println("saturday");}
                                    break;
      
        default:
            break;
      }
    }
} 