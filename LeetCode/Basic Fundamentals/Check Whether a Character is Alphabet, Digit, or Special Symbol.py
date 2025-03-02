# Taking a character as input from the user and checking whether it is an alphabet, digit, or special symbol
char = input("Enter a character: ")

if char.isalpha():
    print("The character is an alphabet.")
elif char.isdigit():
    print("The character is a digit.")
else:
    print("The character is a special symbol.")
