class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int boat=0;
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(limit>=people[left]+people[right]){
                boat++;
                left++;
                right--;
            }
            else if(limit<people[left]+people[right]){
                boat++;
                right--;
            }
        }
        return boat;
    }
}
