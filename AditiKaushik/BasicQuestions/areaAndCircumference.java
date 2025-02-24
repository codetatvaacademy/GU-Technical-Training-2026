package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class areaAndCircumference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();
        System.out.println("Area of Circle: " + Math.PI * radius * radius);
        System.out.println("Circumference of Circle: " + 2 * Math.PI * radius);
        sc.close();
    }
}
