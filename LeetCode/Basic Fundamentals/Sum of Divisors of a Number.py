# Taking a number as input from the user and printing the sum of its divisors
num = int(input("Enter a number: "))

sum_divisors = 0
for i in range(1, num + 1):
    if num % i == 0:
        sum_divisors += i

print("The sum of the divisors of", num, "is:", sum_divisors)
