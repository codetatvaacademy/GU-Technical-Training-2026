import java.util.*;
public class ParkingLot{
    int vehicleNumber;
    double hours;
    double bill;
    ParkingLot(){
        vehicleNumber=0;
        hours=0.0;
        bill=0.0;
    }
    void input(int vehicleNumber, double hours){
        this.vehicleNumber=vehicleNumber;
        this.hours=hours;
        this.bill=0.0;
    }
    void calculate(){
        if(hours<=1){
            bill=3.0;
        }
        else{
            bill=3.0+(hours-1)*1.5;
        }
    }
    void display(){
        System.out.println("Vehicle Number: "+ vehicleNumber);
        System.out.println("Hours: "+hours);  
        System.out.println("Total Bill: "+bill);
    }
    public static void main(String args[]){
        ParkingLot parkingLot=new ParkingLot();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vehicle Number:");
        int v_no=sc.nextInt();
        System.out.println("Enter hours:");
        double h=sc.nextDouble();
        parkingLot.input(v_no,h);
        parkingLot.calculate();
        parkingLot.display();
        sc.close();
    }
}