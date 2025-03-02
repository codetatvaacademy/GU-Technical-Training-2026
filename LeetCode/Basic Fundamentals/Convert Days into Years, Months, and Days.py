# Taking the number of days as input from the user and converting it into years, months, and remaining days
days = int(input("Enter the number of days: "))
years = days // 365
remaining_days = days % 365
months = remaining_days // 30
remaining_days = remaining_days % 30
print(f"{days} days is equal to {years} years, {months} months, and {remaining_days} days.")
