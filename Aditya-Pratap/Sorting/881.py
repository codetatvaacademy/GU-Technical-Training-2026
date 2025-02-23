class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        n = len(people)
        count = 0
        i, j = 0, n - 1
        while i <= j:
            if people[i] + people[j] <= limit:
                count += 1
                i += 1
                j -= 1
            else:
                count += 1
                j -= 1
        return count
