def reservedSeats(n, bookings):
    seats = [0] * n

    for book in bookings:
        seats[book[0] - 1] += book[2]
        if book[1] < n:
            seats[book[1]] -= book[2]

    for i in range(1, n):
        seats[i] += seats[i - 1]

    return seats
                


# n = 5
# bookings = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
n=3
bookings=[[1,3,5],[2,2,10]]
res = reservedSeats(n, bookings)
print(res)
#output [10, 55, 45, 25, 25]
#Time Complexity = O(n*m) [n=no.of flights; m=booking range]
#Space Complexity =O(n)

