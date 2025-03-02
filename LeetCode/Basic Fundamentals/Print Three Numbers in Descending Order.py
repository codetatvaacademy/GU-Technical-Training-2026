# Taking three numbers as input from the user and printing them in descending order
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))
numbers = [num1, num2, num3]
numbers.sort(reverse=True)
print("The numbers in descending order are:", numbers)
