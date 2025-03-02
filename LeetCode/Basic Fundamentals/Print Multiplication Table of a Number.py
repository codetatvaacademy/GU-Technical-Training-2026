# Taking a number as input from the user and printing its multiplication table
num = int(input("Enter a number: "))

print(f"Multiplication table of {num}:")
for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")
