int[] nums = {1, 1, 2, 3, 3, 4};
int n = nums.length;
if (n == 0) return 0; // edge case
int index = 1; // Pointer for inserting unique elements
for (int i = 1; i < n; i++) {
    if (nums[i] != nums[i - 1]) {
        nums[index] = nums[i];
        index++;
    }
}
// Output the updated array with unique elements
System.out.println(Arrays.toString(Arrays.copyOf(nums, index)));
// Output: [1, 2, 3, 4]
