# Taking a number as input from the user and checking whether it is an Armstrong number
num = int(input("Enter a number: "))

original_num = num
sum_of_cubes = 0
while num > 0:
    digit = num % 10
    sum_of_cubes += digit ** 3
    num = num // 10

if original_num == sum_of_cubes:
    print(f"{original_num} is an Armstrong number.")
else:
    print(f"{original_num} is not an Armstrong number.")
