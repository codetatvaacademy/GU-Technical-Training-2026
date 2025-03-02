# Printing different series up to nth term given by user
n = int(input("Enter the term (n): "))

print("Series 1: 1, 3, 6, 10, 15, ...")
series_1 = [sum(range(1, i + 1)) for i in range(1, n + 1)]
print(series_1)

print("Series 2: 1, 11, 111, 1111, ...")
series_2 = [int("1" * i) for i in range(1, n + 1)]
print(series_2)

print("Series 3: 1, 12, 123, 1234, ...")
series_3 = [int("".join(str(x) for x in range(1, i + 1))) for i in range(1, n + 1)]
print(series_3)

print("Series 4: 0, 7, 26, 63, ...")
series_4 = [i ** 3 - 1 for i in range(n)]
print(series_4)

print("Series 5: 0, 1, 1, 2, 3, 5, 8, ... (Fibonacci series)")
series_5 = [0, 1]
for i in range(2, n):
    series_5.append(series_5[-1] + series_5[-2])
print(series_5)

print("Series 6: 0, 1, 3, 7, 15, ...")
series_6 = [2**i - 1 for i in range(n)]
print(series_6)

print("Series 7: x - x^2 + x^3 - x^4 + x^5 ... nth term (sum)")
x = int(input("Enter the value of x: "))
series_7_sum = sum((-1)**(i+1) * x**i for i in range(1, n + 1))
print(series_7_sum)
