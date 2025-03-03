import java.util.Scanner;

public class P38_ParkingLot {
    private int vehicleNumber ;
    private double hour ;

    P38_ParkingLot() {
        vehicleNumber = 0 ;
        hour = 0.0 ;
    }

    void input() {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter vehicle Number : ");
        vehicleNumber = sc.nextInt();
        System.out.print("Enter Park hour : ");
        hour = sc.nextDouble();
    }
    void calculate() {
        if ( hour == 1 ) {
            System.out.println("Bill is :: " + 3 + "rs");
        }
        else {
            double extra = (hour-1)*1.5 ;
            double bill = hour * 3 ;
            System.out.println("Bill is : " + (bill + extra));
        }
    }
    void display() {
        System.out.println("Vehicle Number : " + vehicleNumber );
        System.out.println("Parking time : " + hour);
    }

    public static void main(String[] args) {
        P38_ParkingLot p = new P38_ParkingLot();
        p.input();
        p.calculate();
        p.display();
    }
}
