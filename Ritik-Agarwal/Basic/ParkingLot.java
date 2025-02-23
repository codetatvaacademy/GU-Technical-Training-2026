import java.util.Scanner;

public class ParkingLot {

    String vehicleNumber;
    double hours;
    double bill;

    ParkingLot(){
        this.vehicleNumber = "";
        this.hours = 0.0;
        this.bill = 3.0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vehicle number: ");
        vehicleNumber = sc.next();
        System.out.print("Enter the number of hours: ");
        hours = sc.nextDouble();
        sc.close();
    }

    void calculate(){
        if(hours>1.0){
            double addHours = hours-1.0;
            bill += addHours*1.5;
        }
    }

    void display(){
        System.out.println("Vehicle number: " + vehicleNumber);
        System.out.println("Number of hours: " + hours);
        System.out.println("Total bill(in rupees): " + bill);
    }
    public static void main(String[] args) {
        ParkingLot parking = new ParkingLot();
        parking.input();
        parking.calculate();
        parking.display();
    }
}