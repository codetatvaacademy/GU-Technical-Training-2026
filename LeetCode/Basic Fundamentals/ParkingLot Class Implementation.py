class ParkingLot:
    def __init__(self):
        self.vehicleNumber = 0
        self.hours = 0.0
        self.bill = 0.0

    def input(self):
        self.vehicleNumber = int(input("Enter the vehicle number: "))
        self.hours = float(input("Enter the number of hours parked: "))

    def calculate(self):
        if self.hours <= 1:
            self.bill = 3
        else:
            self.bill = 3 + (self.hours - 1) * 1.5

    def display(self):
        print(f"Vehicle Number: {self.vehicleNumber}")
        print(f"Hours Parked: {self.hours}")
        print(f"Bill Amount: {self.bill}")

# Main method to create an object and call methods
parking = ParkingLot()
parking.input()
parking.calculate()
parking.display()
