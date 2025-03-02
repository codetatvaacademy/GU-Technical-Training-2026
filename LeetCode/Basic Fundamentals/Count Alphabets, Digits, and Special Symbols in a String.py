# Taking a string as input from the user and counting the number of alphabets, digits, and special symbols
string = input("Enter a string: ")

alphabets = 0
digits = 0
special_symbols = 0

for char in string:
    if char.isalpha():
        alphabets += 1
    elif char.isdigit():
        digits += 1
    else:
        special_symbols += 1

print("Number of alphabets:", alphabets)
print("Number of digits:", digits)
print("Number of special symbols:", special_symbols)
