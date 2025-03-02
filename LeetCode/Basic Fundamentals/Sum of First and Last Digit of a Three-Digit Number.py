# Taking a 3-digit number as input from the user and printing the sum of the 1st and 3rd digits
num = int(input("Enter a 3-digit number: "))
first_digit = num // 100
third_digit = num % 10
sum_digits = first_digit + third_digit
print("The sum of the 1st and 3rd digits is:", sum_digits)
