class Solution {
    public String largestNumber(int[] nums) {
        // Create a list of strings to store the numbers as strings
        List<String> stringNumbers = new ArrayList<>();
      
        // Convert each integer in the array to a string and add it to the list
        for (int num : nums) {
            stringNumbers.add(String.valueOf(num));
        }
      
        // Sort the list using a custom comparator
        // The custom comparator defines the order based on the concatenation result
        // This ensures that the largest number is formed after sorting
        stringNumbers.sort((str1, str2) -> (str2 + str1).compareTo(str1 + str2));

        // After sorting, if the largest number is "0", it means all numbers were zeros
        // In that case, return "0"
        if ("0".equals(stringNumbers.get(0))) {
            return "0";
        }
      
        // Join all the strings in the list to get the final largest number representation
        return String.join("", stringNumbers);
    }
}
