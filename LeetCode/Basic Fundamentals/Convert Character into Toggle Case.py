# Taking a character as input from the user and converting it to its toggle case
char = input("Enter a character: ")

if char.islower():
    toggle_char = char.upper()
elif char.isupper():
    toggle_char = char.lower()
else:
    toggle_char = char

print("The toggle case character is:", toggle_char)
