def square(num):
    return num*num
def cube(num):
    return num*num*num

if __name__ == "__main__":
    num = int(input("Enter Number: "))
    print(f"Square of {num} is",square(num))
    print(f"Cube of {num} is",cube(num))