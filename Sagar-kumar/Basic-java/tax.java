import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int salary = sc.nextInt();
        if(salary<=10000){
            System.out.println("no tax to be paid");
        }
        else if(salary>10000 && salary<=25000){
            
            double new_salary = salary-.10*salary;
            System.out.println(new_salary);
        }
        else if (salary>25000 && salary<=50000){
            double neww_salary  =  (salary-(.20*salary+2500));
            System.out.println(neww_salary);
        }
        else if(salary>50000){
            double newww_salary  =  (salary-(.30*salary+5000));
            System.out.println(newww_salary);
        }
    }
    
}
