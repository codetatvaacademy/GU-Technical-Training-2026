# Taking a string as input from the user and converting it into PIGLATIN form
def convert_to_piglatin(word):
    vowels = "AEIOUaeiou"
    if word[0] in vowels:
        return word + "yay"
    else:
        for i in range(len(word)):
            if word[i] in vowels:
                return word[i:] + word[:i] + "ay"
        return word + "ay"

string = input("Enter a string: ")
words = string.split()
piglatin_words = [convert_to_piglatin(word) for word in words]
piglatin_string = " ".join(piglatin_words)

print("The PIGLATIN form of the string is:", piglatin_string)
