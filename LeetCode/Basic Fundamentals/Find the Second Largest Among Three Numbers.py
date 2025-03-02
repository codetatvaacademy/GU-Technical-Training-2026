# Taking three numbers as input from the user and printing the 2nd largest number among them
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))

numbers = [num1, num2, num3]
numbers.sort()
second_largest = numbers[1]

print("The 2nd largest number is:", second_largest)
