import math

# Calculating the area based on user's choice
choice = input("Enter the shape (rectangle, circle, triangle): ").lower()

if choice == "rectangle":
    length = float(input("Enter the length: "))
    width = float(input("Enter the width: "))
    area = length * width
    print("The area of the rectangle is:", area)
elif choice == "circle":
    radius = float(input("Enter the radius: "))
    area = math.pi * radius ** 2
    print("The area of the circle is:", area)
elif choice == "triangle":
    base = float(input("Enter the base: "))
    height = float(input("Enter the height: "))
    area = 0.5 * base * height
    print("The area of the triangle is:", area)
else:
    print("Invalid shape")
