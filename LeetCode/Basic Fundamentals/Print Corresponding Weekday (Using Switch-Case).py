# In Python, the closest to switch is dictionary mapping
day_number = int(input("Enter a number (1-7): "))
days = {
    1: "Sunday",
    2: "Monday",
    3: "Tuesday",
    4: "Wednesday",
    5: "Thursday",
    6: "Friday",
    7: "Saturday"
}
print(days.get(day_number, "Invalid input, please enter a number between 1 and 7"))
