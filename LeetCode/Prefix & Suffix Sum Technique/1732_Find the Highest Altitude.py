class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        current_altitude = 0
        max_altitude = 0
        for g in gain:
            current_altitude += g
            max_altitude = max(max_altitude, current_altitude)
        return max_altitude

user_input = input("Enter a list of integers representing altitude gains separated by spaces: ")
gain = list(map(int, user_input.split()))
solution = Solution()
output = solution.largestAltitude(gain)
print(f"The highest altitude reached is: {output}")
