# Taking a number as input from the user and printing its reverse
num = int(input("Enter a number: "))

reverse_num = 0
while num > 0:
    digit = num % 10
    reverse_num = reverse_num * 10 + digit
    num = num // 10

print("The reverse of the number is:", reverse_num)
