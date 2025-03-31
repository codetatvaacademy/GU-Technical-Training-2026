// Define a class called ParkingLot with the following description :-

// 1. Instance variables :-
//    1. int vehicleNumber - to store vehicle number.
//    2. double hours - to storee the number of hours the vehicle is parked.
//    3. double bill - to store the bill amount.
// 2. Member methods :-
//    1. ParkingLot - to initialise data members.
//    2. void input() - to input and store the vehicleNumber and hours.
//    3. void calculate() - to compute the parking charge at rate of 3 rs for the first hour or part thereof and 1.5 rs for each additional hour.
//    4. void display() - to display details.
// 3. Write a main() method to create an object of the class and call the above methods.

import java.util.Scanner;

class ParkingLot {
    int vehicleNumber;
    double hours;
    double bill;

    ParkingLot() {
        this.vehicleNumber = 0;
        this.hours = 0.0;
        this.bill = 0.0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle number: ");
        vehicleNumber = sc.nextInt();
        System.out.print("Enter hours parked: ");
        hours = sc.nextDouble();
        sc.close();
    }

    void calculate() {
        if (hours <= 1) {
            bill = 3.0;
        } else {
            bill = 3.0 + (hours - 1) * 1.5;
        }
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Hours Parked: " + hours);
        System.out.println("Total Bill: Rs." + bill);
    }

    public static void main(String[] args) {
        ParkingLot pl = new ParkingLot();
        pl.input();
        pl.calculate();
        pl.display();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)