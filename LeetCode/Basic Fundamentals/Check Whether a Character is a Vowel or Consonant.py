# Taking a character as input from the user and checking whether it is a vowel or consonant
char = input("Enter a character: ").lower()

if char in 'aeiou':
    print("The character is a vowel.")
elif char.isalpha():
    print("The character is a consonant.")
else:
    print("The character is not a letter.")
