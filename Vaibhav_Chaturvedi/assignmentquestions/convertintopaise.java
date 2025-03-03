package java_practice_questions;

import java.util.Scanner;
import java.util.*;

public class convertintopaise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");
         float money=sc.nextFloat();
         float paise = money*100;
         System.out.println("paise"+paise);
           
    }
}
