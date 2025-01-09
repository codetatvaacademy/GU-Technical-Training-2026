import java.util.Scanner;

public class ParkingLot {
    int vehicleNumber;
    double hours;
    double bill;

    public ParkingLot(){}

    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter vehicle number: ");
        vehicleNumber = sc.nextInt();

        System.out.print("Enter hours: ");
        hours = sc.nextDouble();
        sc.close();
    }

    public void calculate(){
        bill = 3+(hours-1)*1.5;
    }

    public void display(){
        System.out.print("Vehicle number: "+vehicleNumber+", hours: "+hours+", bill: "+bill);
    }

    public static void main(String[] args) {
        ParkingLot park1 = new ParkingLot();

        park1.input();
        park1.calculate();
        park1.display();
    }
    
    
}
