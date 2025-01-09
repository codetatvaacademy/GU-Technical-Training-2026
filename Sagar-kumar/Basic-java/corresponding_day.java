import java.util.Scanner;

public class corresponding_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if(day==1){
            System.out.println("day is sunday");
        }
         else if(day==2){
            System.out.println("day is monday");
        }
       else  if(day==3){
            System.out.println("day is tuesday");
        }
       else if(day==4){
            System.out.println("day is wednesday");
        }
       else if(day==5){
            System.out.println("day is thursday");
        }
       else if(day==6){
            System.out.println("day is friday");
        }
        else if(day==7){
            System.out.println("day is saturday");
        }
        else{
            System.out.println("error");
        }
    }
    
}
