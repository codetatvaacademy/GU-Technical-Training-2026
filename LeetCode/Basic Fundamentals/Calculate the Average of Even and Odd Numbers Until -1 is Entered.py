# Calculating the average of even and odd numbers given by user until user presses -1
even_sum = 0
even_count = 0
odd_sum = 0
odd_count = 0

while True:
    num = int(input("Enter a number (press -1 to stop): "))
    if num == -1:
        break
    if num % 2 == 0:
        even_sum += num
        even_count += 1
    else:
        odd_sum += num
        odd_count += 1

if even_count > 0:
    even_average = even_sum / even_count
else:
    even_average = 0

if odd_count > 0:
    odd_average = odd_sum / odd_count
else:
    odd_average = 0

print("The average of even numbers is:", even_average)
print("The average of odd numbers is:", odd_average)
