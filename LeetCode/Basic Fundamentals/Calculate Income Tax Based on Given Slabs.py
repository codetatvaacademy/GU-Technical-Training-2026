# Taking income as input from the user and calculating the amount of tax to be paid
income = float(input("Enter your income: "))
if income <= 10000:
    tax = 0
elif income <= 25000:
    tax = 0.10 * (income - 10000)
elif income <= 50000:
    tax = 2500 + 0.20 * (income - 25000)
else:
    tax = 5000 + 0.30 * (income - 50000)
print("The tax to be paid is:", tax)
