# Taking a number as input from the user and checking whether it is a palindrome
num = int(input("Enter a number: "))

original_num = num
reverse_num = 0
while num > 0:
    digit = num % 10
    reverse_num = reverse_num * 10 + digit
    num = num // 10

if original_num == reverse_num:
    print(f"{original_num} is a palindrome.")
else:
    print(f"{original_num} is not a palindrome.")
