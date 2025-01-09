def flight(n, bookings):
    sum = [0] * n
    
    for booking in bookings:
        left, right, seats = booking
        sum[left - 1] += seats
        if right < n:
            sum[right] -= seats
    
    for i in range(1, n):
        sum[i] += sum[i - 1]
    
    return sum

n = 5
bookings = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
print(flight(n, bookings)) 

n = 3
bookings = [[1, 3, 5], [2, 2, 10]]
print(flight(n, bookings)) 

n = 5
bookings = [[1, 5, 20], [3, 5, 10]]
print(flight(n, bookings)) 