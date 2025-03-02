# Taking a lower limit and an upper limit from the user and printing all the numbers in between the given limits
lower_limit = int(input("Enter the lower limit: "))
upper_limit = int(input("Enter the upper limit: "))

for num in range(lower_limit, upper_limit + 1):
    print(num, end=" ")
