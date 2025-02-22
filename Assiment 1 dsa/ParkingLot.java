import java.util.Scanner;

public class ParkingLot {
    int vehicleNumber;
    double hours, bill;

    ParkingLot() {
        vehicleNumber = 0;
        hours = 0;
        bill = 0;
    }

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter vehicle number: ");
        vehicleNumber = s.nextInt();
        System.out.print("Enter parking hours: ");
        hours = s.nextDouble();
    }

    void calculate() {
        if (hours <= 1)
            bill = 3;
        else
            bill = 3 + (hours - 1) * 1.5;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Hours Parked: " + hours);
        System.out.println("Bill Amount: Rs. " + bill);
    }

    public static void main(String[] args) {
        ParkingLot p = new ParkingLot();
        p.input();
        p.calculate();
        p.display();
    }
}
