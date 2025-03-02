# Taking a 3-digit number as input from the user and printing the square of the middle digit
num = int(input("Enter a 3-digit number: "))
middle_digit = (num // 10) % 10
square_middle_digit = middle_digit ** 2
print("The square of the middle digit is:", square_middle_digit)
