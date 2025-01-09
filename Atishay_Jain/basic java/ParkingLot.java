package Atishay_Jain;

import java.util.*;

public class ParkingLot{
    int vehicleNumber;
    double hours;
    double bills;
    public static void main(String[] args){
        ParkingLot parking=new ParkingLot();
        parking.input();
        parking.calculate();
        parking.display();
    }

    public void ParkingLot(){
        vehicleNumber=0;
        hours=0.0;
        bills=0.0;
    }

    public void input(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter vehicle number: ");
        vehicleNumber=sc.nextInt();

        System.out.print("Enter the number of hours parked: ");
        hours=sc.nextDouble();
    }

    public void calculate(){
        if(hours<=1){
            bills=3.0;
        }
        else{
            bills=3.0+(hours-1)*1.5;
        }
    }

    public void display(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Hours parked: "+hours);
        System.out.println("Amount paid: "+bills);
    }
}
