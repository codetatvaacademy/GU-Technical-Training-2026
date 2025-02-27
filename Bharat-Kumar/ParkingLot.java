import java.util.Scanner;

public class ParkingLot {
    int vehicleNumber ;
    double hours;
    double bill;
    public ParkingLot(){
        vehicleNumber = 0;
        hours = 0.0;
        bill = 0.0;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vehicle number: ");
        vehicleNumber = sc.nextInt();
        System.out.println("Enter the number of hours: ");
        hours = sc.nextDouble();
    }
    public void calculate(){
        if (hours <= 1) {
            bill = 3.0;
        } else {
            bill = 3.0 + (hours - 1) * 1.5;
        }
    }
    public void display(){
        System.out.println("Vehicle Number: " +vehicleNumber);
        System.out.println("Hours Parked: " +hours);
        System.out.println("Bill: " +bill);
    }
    public static void main(String[] args) {
        ParkingLot p = new ParkingLot();
        p.input();
        p.calculate();
        p.display();
    }
    
}
