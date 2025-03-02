# Taking a character as input from the user and checking whether it is uppercase or lowercase
char = input("Enter a character: ")

if char.isupper():
    print("The character is uppercase.")
elif char.islower():
    print("The character is lowercase.")
else:
    print("The character is not a letter.")
