# Taking a 4-digit number as input from the user and printing all its digits
num = int(input("Enter a 4-digit number: "))
thousands = num // 1000
hundreds = (num // 100) % 10
tens = (num // 10) % 10
units = num % 10
print(f"The digits are: {thousands}, {hundreds}, {tens}, {units}")
