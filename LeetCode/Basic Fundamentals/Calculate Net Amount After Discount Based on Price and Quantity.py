# Taking rate and quantity as input from the user and calculating the amount and net amount to be paid after a discount if the amount exceeds 2000 Rs
rate = float(input("Enter the rate: "))
quantity = float(input("Enter the quantity: "))
amount = rate * quantity
if amount > 2000:
    discount = 0.15 * amount
else:
    discount = 0

net_amount = amount - discount
print("The net amount to be paid is:", net_amount)
