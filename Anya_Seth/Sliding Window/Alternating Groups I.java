class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int k = 3; // Minimum length of alternating group
        int n = colors.length; // Length of colors array
        int ans = 0; // Number of alternating groups
        int count = 0; // Count of current alternating segment length

        // Loop through twice the length of the array to handle cyclic behavior
        for (int i = 0; i < n * 2; ++i) {
            int currentColor = colors[i % n]; // Current color
            int previousColor = colors[(i - 1 + n) % n]; // Previous color

            // Check if the current color equals the previous color
            if (currentColor == previousColor) {
                count = 1; // Reset count to 1 if the same color repeats
            } else {
                ++count; // Increment count for alternating sequence
            }

            // Check if we are past the first length of the array and the count is sufficient
            if (i >= n && count >= k) {
                ans++; // Increment the number of alternating groups
            }
        }

        return ans; // Return the number of alternating groups found
    }
}
