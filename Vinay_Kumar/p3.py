def circumference(r):
    return (2*3.14*r)
def area(r):
    return (3.14*r*r)

if __name__ == "__main__":
    r = int(input("Enter Radius: "))
    print(f"Circumference of Circle is {circumference(r)}")
    print(f"Area of Circle is {area(r)}")
